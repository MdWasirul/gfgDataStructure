package com.sandip.arrays;

public class equiliBriumPoint {
    public static void main(String[] args) {
        int[] arr = {3, 4, 8, -9, 9, 7};
        int[] arr2 = {4, 2, 2};
        System.out.println(isEquiPoint(arr));
        System.out.println(isEquiPoint(arr2));
        System.out.println(ePoint(arr));
    }

    //Naive Solution :
    static boolean isEquiPoint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int ls = 0;
            int rs = 0;
            //for left sum
            for (int j = 0; j < i; j++) {
                ls = ls + arr[j];

            }
            //for right sum
            for (int k = i + 1; k < arr.length; k++) {
                rs = rs + arr[k];

            }
            //for Equilibrium Point:
            if (ls == rs) {
                return true;
            }

        }
        return false;
    }

    //Efficient Solution:
    static boolean ePoint(int[] arr) {
        int rs = 0;
        for (int i = 0; i < arr.length; i++) {
            rs = rs + arr[i];
        }
        int ls = 0;
        for (int i = 0; i < arr.length; i++) {
            rs = rs - arr[i];
            if (ls == rs) {
                return true;
            }
            ls = ls + arr[i];

        }
        return false;
    }
}
