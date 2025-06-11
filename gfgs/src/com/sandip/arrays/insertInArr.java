package com.sandip.arrays;

public class insertInArr {
    public static void main(String[] args) {
        int arr1[] = new int[]{5, 7, 10, 20, 0};
        int n = 4; // current elements

        // insert value 3 at position 2
        n = insert(arr1, n, 3, 5, 2);

        // print updated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    static int insert(int arr[], int n, int x, int cap, int pos) {
        if (n == cap) {
            return n;
        }
        int idx = pos - 1;
        for (int i = n - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];

        }
        arr[idx] = x;
        return (n + 1);
    }
}
