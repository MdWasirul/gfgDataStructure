package com.sandip.Recursion;

public class sumN {
//    public static void main(String[] args) {
//        System.out.println(sumOfN(4));
//    }
//    static int sumOfN(int n){
//        if (n==0)return 0;
//        return n+ sumOfN(n-1);
//    }

    // Palindrome checking using Recursion
    //Initially start=0; end =n-1; n=length of String str.
//    public static void main(String[] args) {
//
//        String s = "GeekskeeG";
//        String s2 = "cabac";
//        String s3 = "geeks";
//
//        System.out.println(isPalindrome(s3, 0, s3.length() - 1));
//
//    }
//
//    static boolean isPalindrome(String str, int start, int end) {
//        if (start >= end)
//            return true;
//
//        return ((str.charAt(start) == str.charAt(end)) &&
//                isPalindrome(str, start + 1, end - 1));
//    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(9987));
    }

    static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumOfDigits(n / 10);
    }
}
