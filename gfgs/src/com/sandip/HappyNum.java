package com.sandip;

import java.util.HashSet;

import java.util.Set;

public class HappyNum {
    public static void main(String[] args) {
        int n = 19;
        int n2 = 61;
        System.out.println(isHappy(n));
    }

    static boolean isHappy(int n) {
        Set<Integer> usedInteger = new HashSet<>();

        while (n != 1 && !usedInteger.contains(n)) {
            usedInteger.add(n);
            int sum = 0;

            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n = n / 10;
            }

            n = sum;

        }
        return n == 1;
    }
}
