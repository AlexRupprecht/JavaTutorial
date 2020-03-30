import java.util.Scanner;

public class Stromstaerke {
    public static void main (String[] args )
    {
        int Widerstand;
        int Spannung;
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben sie einen Widerstand ein:");
        Widerstand = scan.nextInt();
        System.out.println("Geben sie eine Spannung ein:");
        Spannung = scan.nextInt();
        System.out.println("Die Stromstaerke ist : " + ((double)Spannung / (double)Widerstand));

    }
}
