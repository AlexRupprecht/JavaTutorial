package Kap1bis20;

import java.util.Scanner;

public class UeberpruefungBestellung {
    public static void main (String[] args )
    {
        final Scanner scan = new Scanner(System.in);
        final int SB = 5;
        final int MB = 3;
        final int UB = 1;
        int schrauben, muttern, unterlegscheiben;
        System.out.println("Anzahl der Schrauben;");
        schrauben = scan.nextInt();
        System.out.println("Anzahl der Muttern;");
        muttern = scan.nextInt();
        System.out.println("Anzahl der Unterlegscheiben;");
        unterlegscheiben = scan.nextInt();

        if (schrauben > muttern) {
            System.out.println("Kontrollieren Sie Ihre Bestellung!" + '\n' + schrauben * SB + muttern * MB + unterlegscheiben * UB);
        }else {
            System.out.println("Die Bestellung ist okay." + '\n' + schrauben * SB + muttern * MB + unterlegscheiben * UB);
        }
    }
}
