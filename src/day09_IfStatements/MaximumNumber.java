package day09_IfStatements;

public class MaximumNumber {
    public static void main(String[] args) {
        int num1 = 20, num2 = 30;

        if (num1 > num2) {
            System.out.println(num1 + " is maximum");
        }

        if (num2 > num1) {
            System.out.println(num2 + " is maximum");
        }

        System.out.println("---------------------------------------");

        if (num1 > num2) {
            System.out.println(num1 + " is maximum");
        } else {
            System.out.println(num2 + " is maximum");
        }

    }
}
