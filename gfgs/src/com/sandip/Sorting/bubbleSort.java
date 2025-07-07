package com.sandip.Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 8, 20, 5};
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
    }
}
