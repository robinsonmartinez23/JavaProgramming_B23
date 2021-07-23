package day06_UnaryAndShortHand;

import java.text.DecimalFormat;

public class PrimitiveCasting {
    public static void main(String[] args) {
        byte a = 10;
        long b = a;  //implicit casting, automatically done

        double d = 10.0;
        int f = (int)d; // explicit casting, manually

        System.out.println("----------------------");

        long n = 100;
        short m = (short)n;

        float q = 2.5F;
        int u = (int)q;
        long r = (long)q;
        short s = (short)q;

        //Aunque pueda ser posible el casting explicito, si el numero esta fuera del rango dara un resultado no esperado

        System.out.println("----------------------");
        double num1 = 1000.0;
        int num2 = (int)num1;  //explicit casting

        System.out.println("num2 = " + num2); // 1000
        System.out.println("num1 = " + num1); //1000.0

        System.out.println((int) 100.2345); // 100

    }
}
