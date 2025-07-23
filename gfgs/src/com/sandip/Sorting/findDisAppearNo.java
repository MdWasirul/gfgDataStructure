package com.sandip.Sorting;

import java.util.ArrayList;
import java.util.List;

//Find all missing Numbers in a Range[1,N]
//448 Leetcode Q. -Google Question
class findDisAppearNo {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums1 = {1, 1};
        System.out.println(findDisappearedNumbers(nums));
        System.out.println(findDisappearedNumbers(nums1));

    }

    static List<Integer> findDisappearedNumbers(int[] arr) {
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
        //just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < n; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
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