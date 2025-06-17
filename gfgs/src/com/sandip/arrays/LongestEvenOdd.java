package com.sandip.arrays;

//Maximum Even Odd Length in SubArray

public class LongestEvenOdd {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 6, 3, 8};
        int[] arr2 = {1, 3, 5, 7};
        System.out.println(maxEvenOddLength(arr));
        System.out.println(maxEvenOdd(arr2));
    }

    static int maxEvenOddLength(int[] arr) {
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            int currLength = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j - 1] % 2 == 0 && arr[j] % 2 != 0)) {
                    currLength++;
                } else break;

            }
            res = Math.max(currLength, res);
        }
        return res;
    }

    //Effiecient Solution
    static int maxEvenOdd(int[] arr) {
        int res = 1;
        int curr = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                curr++;
                res = Math.max(curr, res);
            } else {
                curr = 1;
            }

        }
        return res;
    }
}
