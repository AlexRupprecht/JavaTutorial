package Kap1bis20;

import java.util.Scanner;

public class Mircowelle {
    public static void main (String[] args )
    {
        final Scanner scan = new Scanner(System.in);
        int anzahlPosten, erhitzungsZeit;
        double empfohleneZeit = 0.0;

        System.out.println("Geben sie die Anzahl der Posten ein:");
        anzahlPosten = scan.nextInt();
        System.out.println("Geben sie die Erhitzungsdauer ein:");
        erhitzungsZeit = scan.nextInt();

        if(anzahlPosten == 1) {
            System.out.println("Die empfohlene Dauer beträgt: " + erhitzungsZeit);
        }
        if (anzahlPosten == 2 ) {
            System.out.println("Die empfohlene Dauer beträgt: " + (erhitzungsZeit * 1.5));
        }
        if (anzahlPosten == 3) {
            System.out.println("Die empfohlene Dauer beträgt: " + (erhitzungsZeit * 2));
        }
        if (anzahlPosten > 3) {
            System.out.println("Nicht Empfohlen!");
        }

    }
}
