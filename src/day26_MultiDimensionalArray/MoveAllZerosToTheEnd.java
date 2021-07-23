package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MoveAllZerosToTheEnd {
    public static void main(String[] args) {
        int [] array = {10,0,5,0,1,1};
        int [] result = new int [array.length];

        int i = 0;
        for(int each : array){
            if (each != 0) {
                result[i] = each;
                i++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
/*
write a program that can mobve all the zeros to the end of the array
		Ex:
			array = {10, 0, 5, 0, 1, 0};

			output:
				{10, 5, 1, 0, 0, 0}

 */