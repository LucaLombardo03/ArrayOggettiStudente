package it.informatica;

import java.util.Arrays;

public class Corso {
    private String nome;
    private String nomeDocente;
    private int crediti;
    private String settore;
    StudenteUniversitario [] studenti;
    private int cont = 0;

    public Corso(String nome, String nomeDocente, int crediti, String settore, int MAX) {
        this.nome = nome;
        this.nomeDocente = nomeDocente;
        this.crediti = crediti;
        this.settore = settore;
        this.studenti = new StudenteUniversitario[MAX];
    }

    public String getNome() {
        return nome;
    }

    public String getNomeDocente() {
        return nomeDocente;
    }

    public int getCrediti() {
        return crediti;
    }

    public String getSettore() {
        return settore;
    }

    public StudenteUniversitario[] getStudenti() {
        return studenti;
    }

    public void aggiungiStudente(StudenteUniversitario s){
        if (cont < this.studenti.length) {
            this.studenti[cont] = s;
            cont++;
        }
    }
    public int[] elencoMatricole() {
        int[] matricole = new int[studenti.length];
        for (int i = 0; i < cont; i++) {
            matricole[i] = this.studenti[i].getMatricola();
        }
        return matricole;
    }
    public StudenteUniversitario[] elencoMaggioreDi(int k){
        int c = 0;
        for(int i = 0; i< cont; i++){
            if(this.studenti[i].getMatricola() > k)
                c++;
        }
        StudenteUniversitario[] matricoleMaggiori = new StudenteUniversitario[c];
        int j = 0;
        for(int i = 0; i < cont; i++){
            if(this.studenti[i].getMatricola() > k){
                matricoleMaggiori[j] = this.studenti[i];
                j++;
            }
        }
        return matricoleMaggiori;
    }
    public boolean esisteStudente (String nome, String cognome) {
        for (int i = 0; i < cont; i++) {
            if (this.studenti[i].getNome().equals(nome) && this.studenti[i].getCognome().equals(cognome))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Corso{" +
                "nome='" + nome + '\'' +
                ", nomeDocente='" + nomeDocente + '\'' +
                ", crediti=" + crediti +
                ", settore='" + settore + '\'' +
                '}';
    }
}
