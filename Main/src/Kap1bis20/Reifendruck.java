package Kap1bis20;

import java.util.Scanner;

public class Reifendruck {
    public static void main (String[] args )
    {
        final Scanner scan = new Scanner(System.in);

        int LV, RV, LH, RH;
        boolean druckok = true;

        System.out.println("Kap1bis20.Reifendruck: rechter Vorderreifen");
        RV = scan.nextInt();
        if(RV > 45 || RV < 35) {
            System.out.println("Nicht erlauber Bereich!");
            druckok = false;
        }
        System.out.println("Kap1bis20.Reifendruck: linker Vorderreifen");
        LV = scan.nextInt();
        if(LV > 45 || LV < 35) {
            System.out.println("Nicht erlauber Bereich!");
            druckok = false;
        }
        System.out.println("Kap1bis20.Reifendruck: rechter Hinterreifen");
        RH = scan.nextInt();
        if(RH > 45 || RH < 35) {
            System.out.println("Nicht erlauber Bereich!");
            druckok = false;
        }
        System.out.println("Kap1bis20.Reifendruck: rechter Hinterreifen");
        LH = scan.nextInt();
        if(LH > 45 || LH < 35) {
            System.out.println("Nicht erlauber Bereich!");
            druckok = false;
        }
        if((LH - RH) < 3 || (LH - RH) > -3 && (LV - RV) < 3 || (LV - RV) > -3 && druckok == true)
            System.out.println("Kap1bis20.Reifendruck ist OK");
        else
            System.out.println("Kap1bis20.Reifendruck nicht in Ordnung");

    }
}
