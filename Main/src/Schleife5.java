import java.util.Scanner;

public class Schleife5 {
    public static void main (String[] args )
    {
        final Scanner scan = new Scanner(System.in);

        int n,  quadratsumme = 0 , kubiksumme = 0;

        System.out.println("Geben Sie n ein:");
        n = scan.nextInt();

        for(int i = 0; i < n; i++)
        {
            quadratsumme = quadratsumme + i * i;
            kubiksumme = kubiksumme + i * i * i;
        }

        System.out.println("Die Quadratsumme beträgt: " + quadratsumme);
        System.out.println("Die Kubiksumme beträgt: " + kubiksumme);
    }
}
