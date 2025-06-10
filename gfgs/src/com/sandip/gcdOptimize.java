package com.sandip;
//Optimize Solution of Gcd by Euclidian solution;

public class gcdOptimize {
    public static void main(String[] args) {
        System.out.println(gcdEuc(10, 15));
    }

    static int gcdEuc(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcdEuc(b, a % b);   // b always greater
        }
    }
}
