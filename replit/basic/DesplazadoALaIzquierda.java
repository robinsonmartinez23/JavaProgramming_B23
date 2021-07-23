package basic;

import java.util.Arrays;
import java.util.Scanner;

public class DesplazadoALaIzquierda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        int[] result = new int[nums.length];
        result[result.length-1] = nums[0];
        for (int i = 0; i <= nums.length-2 ; i++) {
            result[i] = nums[i+1];
        }
        System.out.println(Arrays.toString(result));
    }
}
/*
Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
You may modify and print the given array, or print a new array.`
 */