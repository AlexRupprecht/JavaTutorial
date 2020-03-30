import java.util.Scanner;

public class Effizienz {
    public static void main (String[] args )
    {
        final Scanner scan = new Scanner(System.in);
        double luft, dampf;

        System.out.println("Geben sie die Lufttemeratur ein :");
        luft = scan.nextDouble();
        System.out.println("Geben sie die Dampftemperatur ein :");
        dampf = scan.nextDouble();
        if (dampf < 373) { System.out.println("Die Dampftemperatur ist zu niedrig"); }
        else { System.out.println("Die Effizienz betraegt: " + (1 - luft / dampf)); }


    }
}
