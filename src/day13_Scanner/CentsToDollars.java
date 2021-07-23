package day13_Scanner;

import java.util.Scanner;  // only imports scanner class from "java.util" package
import java.util.*; // imports ALL classes from "java.util" package

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Cents");
        int cents = scan.nextInt();  //225
        int dollars = cents / 100;
        int reminder = cents % 100;

        if (cents >= 0) { // If the input is valid
            if (reminder == 0) {
                System.out.println(cents + " are equal to " + dollars + " dollars");
            } else {
                System.out.println(cents + " are equal to " + dollars + " dollars and " + reminder + " cents");
            }
        } else { //if the input is invalid
            System.err.println("invalid Amount");
        }
    }
}
/*
1. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
			Ex:
				Enter cents
				225

				output:
				225 cents equal to: 2 dollars and 25 cents

				Enter cents
				300 cents equal to: 3 dollars
 */
