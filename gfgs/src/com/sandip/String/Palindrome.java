package com.sandip.String;

public class Palindrome {
    public static void main(String[] args) {
        String str = "ABCBA";
        palindromeString(str);
        System.out.println(str);

        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome("abccba"));
        System.out.println(isPalindrome("abcdba"));
    }

    static boolean palindromeString(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());

    }

    static boolean isPalindrome(String str) {
        int begin = 0;
        int end = str.length() - 1;
        while (begin < end) {
            if (str.charAt(begin) != str.charAt(end))
                return false;
            begin++;
            end--;
        }
        return true;
    }
}
