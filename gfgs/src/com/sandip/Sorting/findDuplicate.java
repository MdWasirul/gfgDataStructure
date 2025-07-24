package com.sandip.Sorting;

//leetcode 287...
//Asked Amazon and microsoft
public class findDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int[] nums2 = {3, 1, 3, 4, 2};
        System.out.println(findDuplicateInArr(nums));
    }

    static int findDuplicateInArr(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] != i + 1) {

                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
