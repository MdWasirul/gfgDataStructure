package com.sandip.Sorting;

import javax.swing.*;

public class intersection {
    public static void main(String[] args) {
        int[] num1 = {3, 5, 10, 10, 10, 15, 15, 20};
        int[] num2 = {5, 10, 10, 15, 30};
//        intersectOfArray(num1, num2);
        interSection(num1, num2);
    }

    //O (m*n)
    static void intersectOfArray(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
//        int[] res = new int[n];

        for (int i = 0; i < m; i++) {
            if (i > 0 && arr1[i] == arr1[i - 1])
                continue;
            for (int j = 0; j < n; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + "\t");
                    break;
                }

            }

        }

    }

    // 0(m+n)
    static void interSection(int[] a, int[] b) {

        int i = 0, j = 0;
        while (i < a.length && j < b.length) {

            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (a[i] < b[j]) {

                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                System.out.print(a[i] + "\t");
                i++;
                j++;
            }
        }
    }
}

