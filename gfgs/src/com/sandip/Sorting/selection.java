package com.sandip.Sorting;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 2, 18};
//        selectSort(arr);

        SelectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

//    static void selectSort(int[] arr) {
//        int n = arr.length;
//        int[] temp = new int[n];
//        for (int i = 0; i < n; i++) {
//            int min_ind = 0;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] < arr[min_ind]) {
//                    min_ind = j;
//                    temp[i]=arr[min_ind];
////                    arr[min_ind]="INF";
//                }
//            }
//
//        }
//        for (int i = 0; i < n; i++) {
//            arr[i]=temp[i];
//
//        }
////        System.out.println(Arrays.toString(temp));
//    }

    static void SelectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_ind = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_ind]) {
                    min_ind = j;
                }

            }
            //swap the minimum el
            int temp = arr[min_ind];
            arr[min_ind] = arr[i];
            arr[i] = temp;

        }
    }


}
