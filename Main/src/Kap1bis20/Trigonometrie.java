package Kap1bis20;

public class Trigonometrie {
    public static void main (String[] args ) {
        double Zahl = 0.5235;
        double sinx;
        double cosx;
        sinx = Math.sin(Zahl);
        cosx = Math.cos(Zahl);
        System.out.println("Sinus: " + sinx);
        System.out.println("Cosinus: " + cosx);
        System.out.println("Ergebnis: " + (Math.pow(cosx,2) + Math.pow(sinx,2)));
    }
}
