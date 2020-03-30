package Kapitel28;

import java.awt.*;

public class PointObjekt {

    public static void main(String[] agrs){
        Point pt1 = new Point(10, 10);
        Point pt2 = new Point(30, 30);

        int flaeche = Math.abs(pt1.x - pt2.x) * Math.abs(pt1.y - pt2.y);

        System.out.println("Die Flaeche betraegt: " + flaeche);
    }

}
