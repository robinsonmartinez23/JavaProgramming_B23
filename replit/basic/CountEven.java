package basic;

import java.util.Scanner;

public class CountEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int counter = 0;
        for (int i = 0; i <=nums.length-1 ; i++) {
            if(nums[i] % 2 == 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
