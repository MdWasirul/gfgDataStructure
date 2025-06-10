package com.sandip;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

//Efficient method to count Trailing Zeros.
public class TrailingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println(CountTrailingZeros(n));
    }

//    static int CountTrailingZeros(int n) {
//        int res = 0;
//        for (int i = 5; i <= n; i = i * 5) {
//            res = res + n / i;
//        }
//        return res;
//    }

    //Same using While loop
    static int CountTrailingZeros(int n) {
        int res = 0;
        int powOf5 = 5;
        while (n >= powOf5) {
            res = res + (n / powOf5);
            powOf5 = powOf5 * 5;
        }
        return res;
    }


}
