import java.util.Scanner;

public class Wechselgeld {
    public static void main (String[] args ) {
        int zahl, dollar, quarter, dime, nickel, cent;
        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie den Betrag in Cent ein: ");
        zahl = scan.nextInt();

        dollar = zahl/100;
        zahl = zahl%100;

        quarter = zahl/25;
        zahl = zahl%25;

        dime = zahl/10;
        zahl = zahl%10;

        nickel = zahl/5;
        cent = zahl%5;

        System.out.println("Dein Wechselgeld ist " );
        System.out.print(dollar + " Dollar " );
        System.out.print(quarter + " Quarter ");
        System.out.print(dime + " Dime ");
        System.out.print(nickel + " Nickel " );
        System.out.print(quarter + " Quarter ");
        System.out.print(cent + " Cent ");
    }
}
