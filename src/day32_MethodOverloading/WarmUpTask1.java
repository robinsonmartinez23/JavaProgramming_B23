package day32_MethodOverloading;

public class WarmUpTask1 {
    public static void main(String[] args) {
    // 10+12
    int sum1 = sumOf2Numbers(10,12);
        System.out.println("sum1 = " + sum1);
    // 100, 200, 300
    int sum2 = sumOf3Numbers(100,200, 300);
        System.out.println("sum2 = " + sum2);
    // 1000, 2000, 3000, 4000
    int sum3 = sumOf4Numbers(1000,2000, 3000, 4000);
        System.out.println("sum3 = " + sum3);

        System.out.println();
//-------------------------------------------------------------------

    // 10+12
        int r1 = sum(10,12);
        System.out.println("r1 = " + r1);
    // 100, 200, 300
        int r2 = sum(100,200, 300);
        System.out.println("r2 = " + r2);
    // 1000, 2000, 3000, 4000
        int r3 = sum(1000,2000, 3000, 4000);
        System.out.println("r3 = " + r3);
    }

    public static int sumOf2Numbers(int a, int b) {
        return a+b;
    }

    public static int sumOf3Numbers(int a, int b, int c) {
        return a+b+c;
    }

    public static int sumOf4Numbers(int a, int b, int c, int d) {
        return a+b+c+d;
    }
    //---------------------Method Overloading-------------------------

    public static int sum (int a, int b){
        return a+b;
    }
    public static int sum (int a, int b, int c){
        return a+b+c;
    }
    public static int sum (int a, int b, int c, int d){
        return a+b+c+d;
    }
}



/*
Task1:
    1. create a method that can find the sum of two numbers
                    method name: sumOf2Numbers
    2. create a method that can find the sum of three numbers
                    method name: sumOf3Numbers
    3. create a method that can find the sum of four numbers
                    method name: sumOf4Numbers
 */