package com.sandip.arrays;


import java.lang.reflect.Array;
import java.util.Arrays;

public class moveZero {
    public static void main(String[] args) {
        int[] arr = {10, 5, 0, 0, 8, 0, 9, 0};
        moveToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveToEnd(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] != 0) {
                        swap(arr, i, j);
                        break;
                    }
                }
            }

        }

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
