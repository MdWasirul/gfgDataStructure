package com.sandip.String;

//1967. Number of Strings That Appear as Substrings in Word

public class NoOfString {
    public static void main(String[] args) {
        String[] patterns = {"a", "abc", "bc", "d"}; //return true.
        String word = "abc";
        System.out.println(numOfStrings(patterns, word));
    }

    static int numOfStrings(String[] patterns, String word) {

        int count = 0;
//        for (String s : patterns) {
//            if (word.contains(s)) {
//                count++;
//            }
//        }
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
                count++;
            }

        }
        return count;
    }
}
