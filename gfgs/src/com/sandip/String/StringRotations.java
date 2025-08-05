package com.sandip.String;

import java.sql.SQLOutput;

public class StringRotations {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        System.out.println(areRotations(s1, s2));
    }

    static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return ((s1 + s2).indexOf(s2) >= 0);
    }
}


