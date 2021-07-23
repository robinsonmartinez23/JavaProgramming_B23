package day07_ShortHand_Relational;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 101;
        boolean even = number%2 == 0;
        boolean odd = number != 0;
        System.out.println("number is even: "+even);
        System.out.println("number is odd: "+odd);
        /*
        number = 11;
        even: number%2 == 0
        odd: number%2 != 0
         */
    }
}
