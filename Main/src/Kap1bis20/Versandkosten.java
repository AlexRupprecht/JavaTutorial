package Kap1bis20;

import java.util.Scanner;

public class Versandkosten {
    public static void main (String[] args )
    {
        final Scanner scan = new Scanner(System.in);
        int gewicht = 1, zaehler = 10;
        double versandkosten = 3.0;

        while(gewicht > 0)
        {
            System.out.println("Gewicht der Sendung: ");
            gewicht = scan.nextInt();
            if (gewicht > 10)
            {
                while(zaehler < gewicht)
                {
                    zaehler = zaehler + 1 ;
                    versandkosten = versandkosten + 0.25;
                }
                zaehler = 10;
            }
                System.out.println("Kap1bis20.Versandkosten: " + versandkosten);
                versandkosten = 3.0;
        }
    }
}
