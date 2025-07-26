package com.sandip.Sorting;

import java.util.ArrayList;
import java.util.List;

class findAllDuplicate {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums));
    }

    static List<Integer> findDuplicates(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }

        }
        List<Integer> ans = new ArrayList<>();

        for (int index = 0; index < n; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index]);


            }
        }
        return ans;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}