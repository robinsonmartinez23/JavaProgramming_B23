package basic;

import java.util.Scanner;

public class AverageTemperaturas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
        double sum = 0;
        for (int i = 0; i <= temps.length-1 ; i++) {
            sum += temps[i];
        }
        System.out.println(sum/temps.length);
    }
}
