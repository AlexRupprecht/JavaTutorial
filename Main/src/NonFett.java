import java.util.Scanner;

public class NonFett {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        double preisA, preisB;
        int prozentA, prozentB;
        System.out.println("Preis pro Pfund Packung A:");
        preisA = scan.nextDouble();
        System.out.println("Prozent mageres Fleisch Packung A:");
        prozentA = scan.nextInt();
        System.out.println("Preis pro Pfund Packung B:");
        preisB = scan.nextDouble();
        System.out.println("Prozent mageres Fleisch Packung B:");
        prozentB = scan.nextInt();
        System.out.println("Packung A kostet pro Pfund mageres Fleisch :" + (preisA / (double) prozentA * 100));
        System.out.println("Packung B kostet pro Pfund mageres Fleisch :" + (preisB / (double) prozentB * 100));
        if ((preisA / (double) prozentA * 100) < (preisB / (double) prozentB * 100)) {
            System.out.println("Packung A ist preiswerter");
        }else{
            System.out.println("Packung B ist preiswerter");
        }
    }
}
