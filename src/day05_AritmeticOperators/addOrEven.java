package day05_AritmeticOperators;

public class addOrEven {
    public static void main(String[] args) {
        int number = 200;
        boolean isEven = number%2 == 0;
        boolean isOdd = number%2 > 0;
        System.out.println(number + "is a even number: "+ isEven);
        System.out.println(number + "is a odd number: "+ isOdd);

    }
}

