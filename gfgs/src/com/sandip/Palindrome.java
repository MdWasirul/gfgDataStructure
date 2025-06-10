package com.sandip;

//Check if a number is Palindrome or Not;
// if a number is reverse then it should be same as original number;

public class Palindrome {
    public static void main(String[] args) {
        int inputNumber = 363;
        System.out.println(isPalindrome(inputNumber));

    }

    static boolean isPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while (temp != 0) {
            int lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp = temp / 10;
        }

        return (rev == n);
    }
}
