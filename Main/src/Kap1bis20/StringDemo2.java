package Kap1bis20;

public class StringDemo2 {
    public static void main ( String[] args )
    {
        String str = new String( "Elementary, my dear Watson!" );
        System.out.println("Die Laenge ist: " + str.length());

        String erster = new String("    In einem Loch    in der Erde, da lebte ein Hobbit.   ");
        String zweiter;
        zweiter = erster.trim();
        System.out.println(erster);
        System.out.println(zweiter);
    }
}
