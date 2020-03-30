package Kapitel27;

import java.awt.*;
import java.util.Scanner;

public class PointObjekt {
    public static void main(String[] agrs){
            final Scanner scan = new Scanner(System.in);
            int x1, x2, y1, y2;
        System.out.println("Geben Sie den ersten X-Wert ein:");
        x1 = scan.nextInt();
        System.out.println("Geben Sie den ersten Y-Wert ein:");
        y1 = scan.nextInt();
        System.out.println("Geben Sie den zweiten X-Wert ein:");
        x2 = scan.nextInt();
        System.out.println("Geben Sie den zweiten Y-Wert ein:");
        y2 = scan.nextInt();
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        if(point1.equals(point2)){
        System.out.println("Die Koordinaten der beiden Punkte sind gleich:");
        System.out.println(point1 + " und " + point2);
        }else{
            System.out.println(point1);
            System.out.println(point2);
        }
    }
}
