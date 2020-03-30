import java.util.Scanner;

public class CentZuDollar {
    public static void main (String[] args) {
        int zahl;
        int dollar;
        int cent;

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben sie den Centbetrag ein:");
        zahl = scan.nextInt();
        dollar = zahl/100;
        cent = zahl%100;
        System.out.println("Das ergibt " + dollar + " Dollar und " + cent + " Cent.");
    }
}
