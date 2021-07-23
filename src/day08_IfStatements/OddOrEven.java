package day08_IfStatements;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 100;
        boolean odd = number%2 != 0;
        if (odd){ // if the number is odd
            System.out.println(number+" is odd number");
        }
        if (!odd){
            System.out.println(number+" is even number");
        }

    }
}
