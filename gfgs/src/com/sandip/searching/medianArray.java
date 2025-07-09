package com.sandip.searching;

import java.util.Arrays;

public class medianArray {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {5, 15, 25, 35, 45};

        int a1 = arr1.length;
        int a2 = arr2.length;

        int c1 = a1 + a2;
        int[] c = new int[c1];
        // using the pre-defined function arraycopy
        System.arraycopy(arr1, 0, c, 0, a1);
        System.arraycopy(arr2, 0, c, a1, a2);
//        int sortArr = Arrays.sort(c);
    }
}
/*
// determines length of both arrays
        int a1 = arr1.length;
        int b1 = arr2.length;

        // resultant array size
        int c1 = a1 + b1;

        // create the resultant array
        int[] c = new int[c1];

        // using the pre-defined function arraycopy
        System.arraycopy(arr1, 0, c, 0, a1);
        System.arraycopy(arr2, 0, c, a1, b1);

 */