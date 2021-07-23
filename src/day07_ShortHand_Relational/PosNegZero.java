package day07_ShortHand_Relational;

public class PosNegZero {
    public static void main(String[] args) {
        int number = 100;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number ==0;

        System.out.println("isZero = " + isZero);
        System.out.println("isNegative = " + isNegative);
        System.out.println(isPositive);

        System.out.println("---------------------");

        if (number > 0)
            System.out.println(number+" is positive");
        if (number < 0)
            System.out.println(number+" is negative" );
        if (number == 0)
            System.out.println(number+" is Zero");

    }
}
