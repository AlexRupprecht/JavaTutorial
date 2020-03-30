package Kap1bis20;

import java.util.Scanner;

public class Y2K {
    public static void main(String[] agrs){
        final Scanner scan = new Scanner(System.in);
        int gebJahr, aktJahr;
        System.out.println("Geburtsjahr:");
        gebJahr = scan.nextInt();
        System.out.println("Aktuelles Jahr:");
        aktJahr = scan.nextInt();

        if(gebJahr > aktJahr){
            System.out.println("Ihr Alter ist: " + (100 - gebJahr + aktJahr));
        }else{
            System.out.println("Ihr Alter ist: " + (aktJahr - gebJahr));
        }

    }
}
