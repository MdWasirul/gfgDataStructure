package com.sandip.Sorting;

//Cyclic Sort
/*
When given number from range 1 to N in continuous form like number only b/w range
Ex : n=5 then 1,2,3,4,5 or 5,4,3,2,1 or 3,5,2,1,4 like this......
 */

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
//        int[]arr={8,9,6,7,5,4,1,3,2};
        cycSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cycSort(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }

        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
