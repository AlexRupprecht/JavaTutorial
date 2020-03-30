package Kap1bis20;

import java.util.Scanner;

public class HMittel {
    public static void main (String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Geben sie einen Wert für x ein: ");
        x = scan.nextInt();
        System.out.println("Geben sie einen Wert für y ein: ");
        y = scan.nextInt();
        System.out.println("Arithmetisches Mittel :"+ ((x + y ) / 2));
        System.out.println("Harmonisches Mittel :" + (2 / (1/(double)x  + 1/(double)y)));

    }
}
