package Kap1bis20;

import java.util.Scanner;

public class Bereicheaddieren {
    public static void main (String[] args )
    {
        final Scanner scan = new Scanner(System.in);
        int Untergrenze, Obergrenze, EingabeZahl, summeinbreich = 0, summeausserhalb = 0;
        System.out.println("Untergrenze:");
        Untergrenze = scan.nextInt();
        System.out.println("Obergrenze:");
        Obergrenze = scan.nextInt();
        do
        {
            System.out.println("Daten Eingeben:");
            EingabeZahl = scan.nextInt();
            if (EingabeZahl > Obergrenze || EingabeZahl < Untergrenze)
                summeausserhalb = summeausserhalb + EingabeZahl;
            else
                summeinbreich = summeinbreich + EingabeZahl;
        }while(EingabeZahl != 0);
        System.out.println("Summe der Werte innerhalb des Bereichs: "+ summeinbreich);
        System.out.println("Summe der Werte ausserhalb des Bereichs: "+ summeausserhalb);
    }
}
