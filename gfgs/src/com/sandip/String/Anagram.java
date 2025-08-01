package com.sandip.String;

/*
two strings are considered anagrams if they contain the exact same characters in the same frequencies,
but in a different order. For example, "listen" and "silent"
 */

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(areAnagram("listen", "silent"));
        System.out.println(areAnagram("aab", "bab"));
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("aab", "bab"));
        System.out.println(isAnagram("aab", "bab"));
    }

    //Naive Solution

    static boolean areAnagram(String s1, String s2) {
        if ((s1.length() != s2.length())) {
            return false;
        }

        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);

        char[] a2 = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);

        return s1.equals(s2);
    }

    static final int CHAR = 256;

    static boolean isAnagram(String s1, String s2) {
        if ((s1.length() != s2.length())) {
            return false;
        }

        int count[] = new int[CHAR];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i = 0; i < CHAR; i++) {
            if (count[i] != 0) return false;

        }
        return true;
    }
}
