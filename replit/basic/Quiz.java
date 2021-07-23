package basic;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");

        String a = s.next();

        //your code here
        if (a.length() == 1) {
            if (a.contains("a")) {
                System.out.println(a + " is wrong");
            } else if (a.contains("b")) {
                System.out.println(a + " is correct");
            } else if (a.contains("c")) {
                System.out.println(a + " is wrong");
            } else {
                System.out.println(a + " is not a valid answer");
            }
        } else {
            System.out.println(a + " is not a valid answer");
        }
    }
}
