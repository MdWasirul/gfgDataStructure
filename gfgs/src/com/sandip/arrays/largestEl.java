package com.sandip.arrays;

public class largestEl {
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 20, 8};
        System.out.println(getlargestEl(arr1));
    }

    static int getlargestEl(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = true;

            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                return i;
            }
        }
        return -1;
    }
}
