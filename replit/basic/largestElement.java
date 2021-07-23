package basic;

import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }
        String longest = "";
        for (int i = 0; i <= words.length-1 ; i++) {
            if (longest.length() <= words[i].length()){
                 longest = words[i];
            }else{
                continue;
            }
        }
        System.out.println(longest);
    }
}
