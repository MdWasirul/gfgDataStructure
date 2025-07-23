package com.sandip.Sorting;
//https://leetcode.com/problems/missing-number/
// Amazon Question; number range [0,N];  //268 problem

import java.util.Arrays;

class MissingNumberInArr {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int[] nums2 = {4, 0, 2, 1};
        int[] nums3 = {1, 0, 3, 2};
//        missingNumber(nums2);
        System.out.println(missingNumber(nums2));
//        System.out.println(Arrays.toString(nums2));

    }


    static int missingNumber(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int correctIndex = arr[i];
            if (arr[i] < n && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        //search for first missing number
        for (int index = 0; index < n; index++) {
            //Case:1
            if (arr[index] != index) {
                return index;
            }
        }
        //Case:2
        return n;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}