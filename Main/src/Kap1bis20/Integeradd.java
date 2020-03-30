package Kap1bis20;

import java.util.Scanner;

public class Integeradd {
    public static void main (String[] args )
    {
        final Scanner scan = new Scanner(System.in);

        int Anzahl, EingabeZahl, Zaehler = 0, Summe = 0;

        System.out.println("Wie viele Integer sollen addiert werden:");
        Anzahl = scan.nextInt();

        while(Zaehler < Anzahl) {
            Zaehler++;
            System.out.println("Geben Sie einen Integer ein:");
            EingabeZahl = scan.nextInt();
            Summe = Summe + EingabeZahl;
        }
        System.out.println("Die Summe beträgt " + Summe);

    }
}
