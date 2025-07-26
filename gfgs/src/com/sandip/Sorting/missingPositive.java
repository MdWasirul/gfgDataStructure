package com.sandip.Sorting;

public class missingPositive {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1};
        int[] arr2 = {1, 2, 0};
        int[] arr3 = {3, 4, -1, 1};
        int[] arr4 = {7, 8, 9, 11, 12};
        System.out.println(firstMissingPositive(arr4));
    }

    static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        //search for first missing number
        for (int index = 0; index < n; index++) {
            //Case:1
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        //Case:2
        return n + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
