package it.informatica;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        StudenteUniversitario studente1 = new StudenteUniversitario("Luca", "Lombardo", 152);
        StudenteUniversitario studente2 = new StudenteUniversitario("Pippo", "Lombardo", 100);
        StudenteUniversitario studente3 = new StudenteUniversitario("Pluto", "Lombardo", 157);
        Corso ingegneria = new Corso("Ingegneria", "Saetti", 6, "Informatica", 100);

        ingegneria.aggiungiStudente(studente1);
        ingegneria.aggiungiStudente(studente2);
        ingegneria.aggiungiStudente(studente3);
        ingegneria.aggiungiStudente(studente3);
        ingegneria.aggiungiStudente(studente3);

        System.out.println(ingegneria.toString());
        System.out.println(studente1.toString());

        int[] m = ingegneria.elencoMatricole();
        for (int i=0; i<m.length; i++){
            System.out.println(m[i]);
            if(m[i] == 0)
                break;
        }

        System.out.println("Inserisci un valore per stampare le matricole maggiori di: ");
        int matr = sc.nextInt();
        StudenteUniversitario[] matricoleMaggiori = ingegneria.elencoMaggioreDi(matr);
        for (int i=0; i<matricoleMaggiori.length; i++)
            System.out.println(matricoleMaggiori[i]);

        System.out.println("Esiste questo studente: " + ingegneria.esisteStudente("Luca", "Lombardo"));

    }
}
