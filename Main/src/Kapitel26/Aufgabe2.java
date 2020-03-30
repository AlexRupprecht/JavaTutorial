package Kapitel26;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        int zahl, summe = 0, zaehler = 0;
        String eingabe;
        final String antwortJa = "ja", antwortNein = "nein";
        boolean JaNein = false;

        do{
            System.out.println("Eingabeaufforderung <ja> oder <nein>?");
            eingabe = scan.next();

            if (!eingabe.equals(antwortJa) && !eingabe.equals(antwortNein))
            {
                System.out.println("Eingabe ungueltig!");
                System.out.println();
            }

            if (eingabe.equals(antwortJa))
                JaNein = true;

            if (eingabe.equals(antwortNein))
                JaNein = false;

        } while (!eingabe.equals(antwortJa) && !eingabe.equals(antwortNein));
        System.out.println();
        while (zaehler < 5) {
            zaehler++;
            if (JaNein == true){
                System.out.println("Geben Sie " + zaehler + " Zahl ein: ");
                zahl = scan.nextInt();

                summe += zahl;
            }else{
                zahl = scan.nextInt();
                summe += zahl;
            }
        }
        System.out.println();
        System.out.println("Gesamtsumme: " + summe);
    }
}
