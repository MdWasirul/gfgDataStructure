package com.sandip.arrays;

public class subArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};   //sum=33
        int[] arr2 = {1, 4, 0, 0, 3, 10, 5};//sum=7
        int[] arr3 = {2, 4};  //sum=3
        int[] arr4 = {4, 8, 12, 5};// sum=17
//        System.out.println(isSumSubArr(arr, 33));
        System.out.println("SubArray With Given Sum :");
        System.out.println(isSubSum(arr, 33));
        System.out.println(isSubSum(arr2,7));
        System.out.println(isSubSum(arr3,3));
        System.out.println(isSubSum(arr4, 17));

    }

    static boolean isSumSubArr(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum = currSum + arr[j];
                if (currSum == sum) {
                    return true;
                }

            }

        }
        return false;
    }

//    static boolean isSubSum(int[] arr, int sum) {
//        int s = 0, e = 0;
//        int currSum = 0;
//        while (currSum < sum) {
//            currSum = arr[e] + currSum;
//            e++;
//        }
//        while (currSum > sum) {
//            currSum = currSum - arr[s];
//            s++;
//            if (currSum == sum) {
//                return true;
//            }
//        }
//        return false;
//    }
    //arr[]={4,8,12,5{} sum=17
    //Efficient Approach:

    static boolean isSubSum(int[] arr, int sum) {
        int s = 0;
        int currSum = 0;
        for (int e = 0; e < arr.length; e++) {
            currSum = currSum + arr[e];
            while (sum < currSum) {
                currSum = currSum - arr[s];
                s++;
            }
            if (currSum == sum) {
                return true;
            }

        }
        return false;
    }
}
