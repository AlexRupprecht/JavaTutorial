package Kapitel29;

import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] agrs){
        final Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie einen String ein:");
        String string = scan.next();
        for(int i = 0; i < string.length(); i++){
            System.out.println(string.charAt(i));
        }
    }
}
