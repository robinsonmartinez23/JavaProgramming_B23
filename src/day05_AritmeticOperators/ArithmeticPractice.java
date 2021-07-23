package day05_AritmeticOperators;

public class ArithmeticPractice {
    // Verify if the number is divisible by 3
    public static void main(String[] args) {
        int number = 50;
        int reminder3 = number%3;
        int reminder5 = number%5;
        boolean isEvenlyDivisibleBy3 = reminder3 == 0;
        boolean inEvenlyDivisibleBy5 = reminder5 == 0;
        System.out.println(number+" is evenly divisible by 3: "+isEvenlyDivisibleBy3);
        System.out.println(number+" is evenly divisible by 5: "+inEvenlyDivisibleBy5);
    }
}
