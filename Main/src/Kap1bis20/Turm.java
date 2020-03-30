package Kap1bis20;

import java.util.Scanner;

public class Turm {
    public static void main (String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double Sekunden;
        System.out.println("Geben sie die Anzahl der Sekunden ein:");
        Sekunden = scan.nextDouble();
        System.out.println("Die Entfernung betraegt :" + (0.5 * 9.81  * Math.pow(Sekunden,2)));


    }


}
