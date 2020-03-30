package Kapitel29;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] agrs){
        final Scanner scan = new Scanner(System.in);
        String name;

        System.out.println("Geben Sie einen Namen ein:");
        name = scan.nextLine();
        if(name.contentEquals("Amy ") || name.contentEquals("Buffy ") || name.contentEquals("Cathy ")){
            System.out.println("Ms. " + name);
        }else if(name.contentEquals("Elroy ") || name.contentEquals("Fred ") || name.contentEquals("Graham ")){
            System.out.println("Mr. " + name);
        }else{
            System.out.println(name);
        }

    }
}
