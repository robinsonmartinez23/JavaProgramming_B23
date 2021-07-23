package Loops;

import java.util.Scanner;

public class ThreeInARow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE
        for(int i = 0; i <= str.length()-3 ; i++){
            String ch1 = str.substring(i,(i+1));
            String ch2 = str.substring((i+1),(i+2));
            String ch3 = str.substring((i+2),(i+3));
            if(ch1.equals(ch2) && ch2.equals(ch3) ){
                count++;
            }
        }
        System.out.println(count);
    }
}
