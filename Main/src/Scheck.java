import java.util.Scanner;

public class Scheck {
    public static void main (String[] args )
    {
        final Scanner scan = new Scanner(System.in);
        int girokonto, sparkonto;
        System.out.println("Girokonto-Guthaben eingeben:");
        girokonto = scan.nextInt();
        System.out.println("Sparkonto-Guthaben eingeben:");
        sparkonto = scan.nextInt();

        if(girokonto >= 1000 || sparkonto >= 1500 )
            System.out.println("Es wird keine Gebühr verlangt!");
        else
            System.out.println("Es ist eine Gebühr von 0.15$ fällig!");


    }
}
