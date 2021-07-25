package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        int[] nums = new int[10]; // size in Array is fixed "NO CHANGE"
        System.out.println(Arrays.toString(nums)); // default values are 0 size 10

        System.out.println("------------------------------------------");
        ArrayList<Integer> numbers = new ArrayList<Integer>(); // size is dynamic
        numbers.add(10); // Autoboxing index 0
        numbers.add(20); // Autoboxing index 1
        numbers.add(30); // Autoboxing index 2
        numbers.add(40); // Autoboxing index 4
        numbers.add(1,15);

        System.out.println(numbers); // default value is EMPTY size 0 and increase when elem are added
        System.out.println(numbers.get(2));
        System.out.println(numbers.size());

        for (int i = 0; i < numbers.size() ; i++) {
            System.out.println(numbers.get(i));
        }
        for(Integer each :numbers){
            System.out.println(each);
        }

    }
}
