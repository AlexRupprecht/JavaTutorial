package Kap1bis20;

import java.util.Scanner;

public class KreisflaecheBerechenen {
    public static void main (String[] args )
    {
        double radius;
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben sie einen Radius ein:" );
        radius = scan.nextDouble();
        System.out.println("Der Radius ist " + radius);
        System.out.println("und die Kreisflaeche beträgt:" + Math.PI * Math.pow(radius,2));
    }
}
