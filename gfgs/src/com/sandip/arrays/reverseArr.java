package com.sandip.arrays;

import java.util.Arrays;

//Reverse the element in array .
public class reverseArr {
    public static void main(String[] args) {
        int[] arr = {30, 7, 6, 5, 10};
        int[] reversed = reverseArrEl(arr);
        System.out.println(Arrays.toString(reversed));
    }

    static int[] reverseArrEl(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }
}
