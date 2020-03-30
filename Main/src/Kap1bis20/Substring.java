package Kap1bis20;

public class Substring {
    public static void main (String[] args) {
        String str = new String("Golf is a good walk spoiled.");
        int Parameter1 = 0;
        int Parameter2 = 15;
        String sub = str.substring(Parameter1, Parameter2);
        System.out.println(sub);
    }
}
