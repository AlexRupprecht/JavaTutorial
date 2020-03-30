import java.util.Scanner;

public class Kwh {
    public static void main (String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double Kosten;
        double Kilowattstunden;

        System.out.println("Kosten in Cent:" );
        Kosten = scan.nextDouble();
        System.out.println("Kilowattstunden im Jahr:");
        Kilowattstunden = scan.nextDouble();
        System.out.println("Jahreskosten: " + (Kilowattstunden * (Kosten / 100)));
    }
}
