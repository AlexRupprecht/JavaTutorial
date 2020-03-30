package Kap1bis20;

import java.util.Scanner;

public class Fantasy {
    public static void main (String[] args )
    {
        final Scanner scan = new Scanner(System.in);
        String name;
        int staerke, gesundheit, glueck;

        System.out.println("Willkommen zu Yertle's Schatzsuche");
        System.out.println("Geben Sie den Namen der Spielfigur ein:");
        name = scan.next();
        System.out.println("Stärke eingeben(1-10): ");
        staerke = scan.nextInt();
        System.out.println("Gesundheit eingeben(1-10): ");
        gesundheit = scan.nextInt();
        System.out.println("Glück eingeben(1-10):");
        glueck = scan.nextInt();
        if((staerke + gesundheit + glueck) > 15) {
            System.out.println("Sie haben Ihrer Spielfigur zu viele Punkte gegeben!");
            staerke = 5;
            gesundheit = 5;
            glueck = 5;
        }
        System.out.println(name + ", Staerke: " + staerke + " Gesundheit:" + gesundheit + " Glueck: " + glueck);
    }
}
