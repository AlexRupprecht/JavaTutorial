import java.util.Scanner;

public class DeathValley {
    public static void main (String[] args )
    {
        final Scanner scan = new Scanner(System.in);
        double tank, menge, verbrauch;
        System.out.println("Tankkapazität:");
        tank = scan.nextDouble();
        System.out.println("Benzinanzeige:");
        menge = scan.nextDouble();
        System.out.println("Meilen pro Gallone:");
        verbrauch = scan.nextDouble();
        if(((0.01 * menge) * tank * verbrauch) >= 200) {
            System.out.println("Weiterfahren!");
        }else {
            System.out.println("Tanken!");
        }

    }
}
