package Kapitel25;

public class Plaetzchen {
    String sorte;
    String groesse;
    String form;
    boolean verzierung = false;

    public void ausgeben(){
        if(verzierung)
            System.out.println("Sorte " + sorte + ", Groesse " + groesse + ", Form " + form + ", Verzierung ja");
        else
            System.out.println("Sorte " + sorte + ", Groesse " + groesse + ", Form " + form + ", Verzierung nein");
    }

    public static void main(String[] args)  {
        Plaetzchen plaetzchen1 = new Plaetzchen();
        plaetzchen1.sorte = "Kokos";
        plaetzchen1.form = "rund";
        plaetzchen1.groesse = "mittel";

        Plaetzchen plaetzchen2 = new Plaetzchen();
        plaetzchen2.sorte = "Affennuss";
        plaetzchen2.form = "rund";
        plaetzchen2.groesse = "klein";

        Plaetzchen plaetzchen3 = new Plaetzchen();
        plaetzchen3.sorte = "Honigkuchen";
        plaetzchen3.form = "rechteckig";
        plaetzchen3.groesse = "gross";
        plaetzchen3.verzierung = true;

        System.out.println("+++ Plaetzchenliste +++");
        System.out.println();
        plaetzchen1.ausgeben();
        plaetzchen2.ausgeben();
        plaetzchen3.ausgeben();
    }
}
