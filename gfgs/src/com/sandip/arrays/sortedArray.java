package com.sandip.arrays;

public class sortedArray {
    public static void main(String[] args) {
        //return True if array is sorted in ascending Order.
//        int arr1[] = {-1, 0, 8, 12, 15};
//        int arr2[] = {8, 10, 10, 12};
//        int arr3[] = {100};
//        int[] arr4 = {100, 20, 200};
        int[] arr5 = {5, 12, 30, 2, 35};
//        System.out.println(isArraySorted(arr1));
        System.out.println(isSorted(arr5));
    }

    static boolean isArraySorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    //efficient approach
    static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
