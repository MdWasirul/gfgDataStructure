package com.sandip.arrays;

import java.util.Arrays;

public class lRotateOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        lRotateByOne(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void lRotateByOne(int[] arr) {
        int n = arr.length;
        //[1,2,3,4,5] arr[0] store into temp
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;

    }
}
