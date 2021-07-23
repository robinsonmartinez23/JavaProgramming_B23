package basic;

import jdk.nashorn.internal.objects.NativeString;

import java.util.Scanner;

public class PrintFirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),
                          input.nextLine(),input.nextLine()};
        for (int i = 0; i <= words.length-1 ; i++) {
            String wordString = words[i];
            String firstAndLast = wordString.substring(0,1)+wordString.substring(wordString.length()-1);
            System.out.println(firstAndLast);
        }
    }
}
