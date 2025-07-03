package com.sandip.searching;

public class tripletSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 15};
        int[] arr2 = {2, 3, 4, 8, 9, 20, 40};
        int[] arr3 = {2, 5, 10, 15, 18};
        int x = 20; // return true
//        System.out.println(isTriplet(arr2, 32));
        System.out.println(isTriplet(arr3, 33));
    }


    //Naive approach
//    static boolean isTriplet(int[] arr, int x) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                for (int k = j + 1; k < arr.length; k++) {
//                    if (arr[i] + arr[j] + arr[k] == x) {
//                        return true;
//                    }
//
//                }
//
//            }
//
//        }
//        return false;
//    }

    //Two pointer:
    static boolean isTriplet(int[] arr, int x) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (isPairSum(arr, x - arr[i], i + 1)) {
                return true;
            }
        }
        return false;
    }

    //Two pointer Approach:
    static boolean isPairSum(int[] arr, int x, int startIndex) {
        int i = startIndex, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == x) {
                return true;
            } else if (arr[i] + arr[j] < x) {
                i++;

            } else {
                j--;
            }
        }
        return false;
    }
}
