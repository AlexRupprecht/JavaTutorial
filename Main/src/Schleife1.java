import java.util.Scanner;

public class Schleife1 {
    public static void main(String[] agrs){
        final Scanner scan = new Scanner(System.in);
        int startwert, endwert;
        System.out.println("Startwert:");
        startwert = scan.nextInt();
        System.out.println("Endwert:");
        endwert = scan.nextInt();
        do{
            System.out.println(startwert);
            startwert++;
        }while(startwert <= endwert);
    }
}
