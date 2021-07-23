package basic;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstAndLast2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),
                         input.nextLine()};

        String[] result = new String[words.length];
        for (int i = 0; i <= words.length-1 ; i++) {
            String wordString = words[i];
            String firstAndLast = wordString.substring(0,1)+wordString.substring(wordString.length()-1);
            result[i] = firstAndLast;
        }
        System.out.println(Arrays.toString(result));
    }
}

