package com.sandip.searching;

public class iOfFirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 10, 10, 10, 20, 20, 40};
//        int ans = iOfFirstEl(arr, 10);
//        System.out.println(ans);
        int[] arr2 = {5, 10, 10, 20, 20};
        System.out.println(firstOcc(arr2, 20));
        System.out.println(firstOcc(arr2,10));
    }

    static int iOfFirstEl(int[] arr, int target) {

        //Naive Solution:
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }

        }
        return -1;
    }

    static int firstOcc(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
//            int mid = low + (high - low) / 2;
            int mid=(low+high)/2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;

            } else {
                //mid==target
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    high = mid - 1;
                }

            }
        }
        return -1;
    }
}
