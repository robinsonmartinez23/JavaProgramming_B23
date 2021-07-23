package basic;

import java.util.Scanner;

public class Contiene55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        boolean contains = false;
        for (int i = 0; i <= nums.length-2 ; i++) {
            if(nums[i] == 5 && nums[i+1] == 5){
                contains = true;
            }
        }
        System.out.println(contains);
    }
}
