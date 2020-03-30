package Kap1bis20;

public class DurchschnittlicheNiederschlagsmenge {
    public static void main ( String[] args )
    {
        int niederschlagApril = 12;
        int niederschlagMai = 14;
        int niederschlagJuni = 8;

        System.out.println("Niederschlag im April:\t"+niederschlagApril);
        System.out.println("Niederschlag im Mai:\t"+niederschlagMai);
        System.out.println("Niederschlag im Juni:\t"+niederschlagJuni);
        System.out.println("Durchscnitt:\t\t\t"+((niederschlagMai+niederschlagApril+niederschlagJuni)/3));
    }
}
