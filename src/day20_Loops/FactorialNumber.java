package day20_Loops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number:");
        int number = new Scanner(System.in).nextInt();  // 5 * 4 * 3 * 2 * 1
        int result = 1; //

        for(int i = number; i >= 1; i-- ){
      //for(int i = 1;  i <= number ;  i++ ){ //i: 5, 4, 3, 2, 1      Mi forma de hacerlo!
            result *= i;
        }

        System.out.println("result = " + result);
    }
}
/*
1. Write a program that can return the factorial number of any given number
            Ex:
                input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */

