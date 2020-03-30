import java.util.Scanner;

public class Schleife4 {
    public static void main(String[] agrs){
        final Scanner scan = new Scanner(System.in);
        double summe = 0;
        int counter = 0, anzahl;
        System.out.println("Geben Sie n ein:");
        anzahl = scan.nextInt();
        do{
            summe = summe + (1.0/(counter+1));
            counter++;
        }while(counter < anzahl);
        System.out.println("Die Summe ist: " + summe);
    }
}
