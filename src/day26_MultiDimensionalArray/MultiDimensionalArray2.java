package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {
        int [][][] arr3D = {{{1,2,3},{4,5}},{{6,7,8},{9,10}}};
        //index:                    0               1
        System.out.println(Arrays.deepToString(arr3D)); //[[[1, 2, 3], [4, 5]], [[6, 7, 8], [9, 10]]]
        System.out.println(Arrays.deepToString(arr3D[1])); // [[6, 7, 8], [9, 10]]
        System.out.println(Arrays.toString(arr3D[0][1])); // [4, 5]
        System.out.println(arr3D[1][0][2]); //8

        System.out.println("---------------------------------------------------------");

        for( int[][] each2D  : arr3D ){ // for getting each 2 dimensional arrays from the arr3D
            for(int[] each1D : each2D ){ // for getting each 1 dimensional arrays from each 2 dimensional array
                for( int element : each1D ){ // for getting each element from each single dimensional array
                    System.out.print(element+" ");
                }
                System.out.println(); // to append new line after print the elements of each 1 dimensional array
            }
        }
    }
}
