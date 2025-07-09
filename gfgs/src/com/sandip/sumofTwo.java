package com.sandip;

public class sumofTwo {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2));
    }

    static int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;  //for carry left shift by 1 bit
            a = a ^ b;  //without carry Xor the bits
            b = carry;
        }
        return a;
    }
}
