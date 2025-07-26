package com.sandip.Sorting;

//leetcodes Question 645--SetMismatch

import java.util.Arrays;

public class setMismatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        int[] arr2 = {2, 1, 4, 2, 6, 5};
        int[] ans = findErrorNums(arr2);
        System.out.println(Arrays.toString(ans));

    }

    static int[] findErrorNums(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int currIndex = arr[i] - 1;
            if (arr[i] != arr[currIndex]) {
                swap(arr, i, currIndex);
            } else {
                i++;
            }
        }
        //find missing and duplicate value
        for (int index = 0; index < n; index++) {
            if (arr[index] != index + 1) {
                return new int[]{arr[index], index + 1};
            }

        }
        return new int[]{-1, -1};

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
