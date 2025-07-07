package com.sandip.Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 8, 20, 5};
//        int[] arr = {5,10,15,20,30};

        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSorting(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//
//            }
//
//        }

        //suppose Array is sorted so Ther is no need to check all time
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped=false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped=true;

                }

            }
//            if (swapped==false) break;
            if (!swapped) break;

        }
    }
}
