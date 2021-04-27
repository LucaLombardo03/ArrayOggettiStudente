package it.informatica;

public class StudenteUniversitario {
    private String nome, cognome;
    private int matricola;

    public StudenteUniversitario(String nome, String cognome, int matricola){
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    @Override
    public String toString(){
        return nome + ", " + cognome + ", " + matricola;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof StudenteUniversitario){
            StudenteUniversitario a = (StudenteUniversitario) obj;
            return this.nome == a.nome && this.cognome == a.cognome && this.matricola == a.matricola;
        }
        return false;
    }

}
