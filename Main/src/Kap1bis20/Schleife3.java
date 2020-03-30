package Kap1bis20;

import java.util.Scanner;

public class Schleife3 {
    public static void main(String[] agrs){
        final Scanner scan = new Scanner(System.in);
        String wort1, wort2;
        int counter = 0;
        System.out.println("Geben Sie das erste Wort ein:");
        wort1 = scan.next();
        System.out.println("Geben Sie das zweite Wort ein:");
        wort2 = scan.next();
        System.out.print(wort1);
        do{
            System.out.print(".");
            counter++;
        }while(counter < 30);
        System.out.println(wort2);
    }
}
