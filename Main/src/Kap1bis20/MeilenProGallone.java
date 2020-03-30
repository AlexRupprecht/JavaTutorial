package Kap1bis20;

import java.util.Scanner;

public class MeilenProGallone {
    public static void main (String[] args )
    {
        final Scanner scan = new Scanner(System.in);

        int anfangsMeilen = 0, endstandMeilen, gallone, counter = 1;

        while(counter > 0)
        {
            System.out.println("Anfangstand Meilen:");
            anfangsMeilen = scan.nextInt();
            if (anfangsMeilen <= -1)
            {
                System.out.println("bye");
                break;
            }
            System.out.println("Endstand Meilen:");
            endstandMeilen = scan.nextInt();
            System.out.println("Gallone");
            gallone = scan.nextInt();
            System.out.println("Meilen pro Gallone: " + (double)((endstandMeilen - anfangsMeilen) / gallone));

        }

    }
}
