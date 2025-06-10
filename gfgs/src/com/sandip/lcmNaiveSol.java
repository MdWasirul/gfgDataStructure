package com.sandip;

//Naive Solution to find LCm of number (a,b);

public class lcmNaiveSol {
    public static void main(String[] args) {
        System.out.println(lcm(3, 7));
    }

    static int lcm(int a, int b) {
        int res = Math.max(a, b);
        while (true) {
            if (res % a == 0 && res % b == 0) {
                return res;
            } else {
                res++;
            }
        }
    }
}
