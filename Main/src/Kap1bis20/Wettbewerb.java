package Kap1bis20;

import java.util.Scanner;

public class Wettbewerb {
    public static void main (String[] args )
    {
        final Scanner scan = new Scanner(System.in);
        int gewicht;
        System.out.println("Geben sie ein Gewicht ein");
        gewicht = scan.nextInt();
        if (gewicht >=235 && gewicht <= 265)
            System.out.println("Zugelassen");
        else
            System.out.println("Nicht Zugelassen");
    }
}
