package Kapitel29;

import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] agrs) {
        final Scanner scan = new Scanner(System.in);
        String name, vorname, nachname;

        System.out.println("Geben Sie einen Namen ein:");
        name = scan.nextLine();
        int vornamenendeindex = name.indexOf(" ");
        vorname = name.substring(0, vornamenendeindex);
        nachname = name.substring(vornamenendeindex);
        nachname = nachname.toUpperCase();
        System.out.println(vorname + nachname);
    }
}
