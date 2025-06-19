package com.sandip.arrays;


//A majority element in an array A[] of size n is an element that appears more than n/2 times
// (and hence there is at most one such element).


public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 8, 6, 6, 6, 6};
        System.out.println(majElement(arr));
    }

    static int majElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count > n / 2) {
                return i;
            }

        }
        return -1;
    }
}
