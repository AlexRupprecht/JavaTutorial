package Kap1bis20;

import java.util.Scanner;

public class Schleife2 {
    public static void main(String[] agrs){
        final Scanner scan = new Scanner(System.in);
        String wort;
        int counter = 0;
        System.out.println("Geben Sie ein Wort ein:");
        wort = scan.next();
        do{
            System.out.println(wort);
            counter++;
        }while(counter < wort.length());
    }
}
