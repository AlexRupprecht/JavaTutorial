import java.util.Scanner;

public class Delikat {
    public static void main(String[] agrs) {
        final Scanner scan = new Scanner(System.in);
        double produkt, versand = 0;
        int express;
        String artikel;
        System.out.println("Geben Sie den Artikel ein:");
        artikel = scan.next();
        System.out.println("Geben Sie den Preis ein:");
        produkt = scan.nextDouble();
        System.out.println("Expressversand 0==nein/1==Ja:");
        express = scan.nextInt();
        if(express == 1 ){
            versand = 5;
        }
        if(produkt >= 10){
            versand = versand + 3;
        }else{
            versand = versand + 2;
        }
        System.out.println("Rechnung");
        System.out.println("\t" + artikel + ": " + produkt);
        System.out.println("\tVersand: " + versand);
        System.out.println("\tGesamt: " + (produkt+versand));
    }
}
