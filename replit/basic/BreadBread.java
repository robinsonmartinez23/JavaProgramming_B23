package basic;

import java.util.Scanner;

public class BreadBread {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        boolean equal = str.indexOf("bread") == str.lastIndexOf("bread");
        System.out.println("equal = " + equal);
    }
}
