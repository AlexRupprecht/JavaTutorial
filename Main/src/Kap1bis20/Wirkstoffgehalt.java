package Kap1bis20;

import java.util.Scanner;

public class Wirkstoffgehalt {
    public static void main(String[] args) {
        double wirk = 100;
        int mon = 0;

        System.out.println("Monate: " + mon + "  Kap1bis20.Wirkstoffgehalt: " + wirk);

        while (wirk > 50)
        {
            mon++;
            wirk = wirk * 0.96;

            if (wirk > 50)
                System.out.println("Monat: " + mon + "  Kap1bis20.Wirkstoffgehalt: " + wirk);
            else
                System.out.println("Monat: " + mon + "  Kap1bis20.Wirkstoffgehalt: " + wirk + "  ABEGELAUFEN!");
        }

    }
}
