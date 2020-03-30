package Kap1bis20;

import java.util.Scanner;

public class Logarithmus {
    public static void main (String[] args )
    {
        final Scanner scan = new Scanner(System.in);
        double Zahl;
        System.out.println("Geben sie eine Zahl ein :");
        Zahl = scan.nextDouble();
        System.out.println("Der Zweierlogarithmus von" + Zahl + " ist " + (Math.log(Zahl) / Math.log(2)));
    }
}
