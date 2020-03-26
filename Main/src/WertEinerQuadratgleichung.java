public class WertEinerQuadratgleichung {
    public static void main ( String[] args )
    {
        double x = 4;
        double Ergebnis;
        Ergebnis = 3 * Math.pow(x,2) -8 * x + 4;
        System.out.println("bei x = "+ x + " ergibt die Quadratgleichung den Wert " + Ergebnis);
        System.out.println();

        x = 2;
        Ergebnis = 3 * Math.pow(x,2) -8 * x + 4;
        System.out.println("bei x = "+ x + " ergibt die Quadratgleichung den Wert " + Ergebnis);
        System.out.println();

        x = 2/3;
        Ergebnis = 3 * Math.pow(x,2) -8 * x + 4;
        System.out.println("bei x = "+ x + " ergibt die Quadratgleichung den Wert " + Ergebnis);
        System.out.println();
    }
}
