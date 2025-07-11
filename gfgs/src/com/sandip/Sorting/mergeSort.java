package com.sandip.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr1 = {4, 7, 9};
        int[] arr2 = {1, 2, 10, 25, 30};
//        mergeTwoArr(arr1, arr2);
        //Efficient Sol:
        int[] arr3 = {10, 20, 35};
        int[] arr4 = {5, 50, 50};
//        merge(arr3, arr4);
        int[] arr = {10, 15, 20, 11, 30};
        mergeFunc(arr, 0, 2, 4);
        System.out.println(Arrays.toString(arr));
    }

    //Naive Solution:
    static void mergeTwoArr(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] c = new int[m + n];

        for (int i = 0; i < m; i++) {
            c[i] = arr1[i];

        }
        for (int i = 0; i < n; i++) {
            c[m + i] = arr2[i];

        }

        Arrays.sort(c);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");

        }
    }

    static void merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }
        while (i < m) {
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < n) {
            System.out.print(arr2[j] + " ");
            j++;
        }


    }

    //Merge Function of Merge Sort
//    a[]={10,15,20,11,30}; low=0,mid=2,high=4
    static void mergeFunc(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1; //3
        int n2 = high - mid;   //2
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];

        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + i + 1];

        }

        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < n1) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < n2) {
            arr[k] = right[j];
            k++;
            j++;
        }

    }

}
