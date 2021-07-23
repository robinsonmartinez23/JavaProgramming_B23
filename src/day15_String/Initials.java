package day15_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        char f = scan.next().charAt(0);

        System.out.println("Enter your last name: ");
        char l = scan.next().charAt(0);
        scan.close();
/*
        char f = firstName.charAt(0);
        char l = lastName.charAt(0);
*/
        String initials = f+"."+l;
        System.out.println(initials);
    }
}
/*Ask user to enter:
    1. first name
    2. last name
then print the initials
    ex: Robinson
        Martinez
    output: R.M
 */