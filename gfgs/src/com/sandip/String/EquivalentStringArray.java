package com.sandip.String;

public class EquivalentStringArray {
    public static void main(String[] args) {
//        String[] word1 = {"ab", "c"};
//        String[] word2 = {"a", "cb"};
//        String[] word1 = {"a", "cb"};
//        String[] word2 = {"ab", "c"};
//        String[] word1 = {"abc", "d","defg"};
//        String[] word2 = {"abcddefg"};
        String[] word1 = {};
        String[] word2 = {};

        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        int n = word1.length;
        int m = word2.length;
        if (n<1 || m<1) return false;
        StringBuilder sum1 = new StringBuilder();
        StringBuilder sum2 = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sum1.append(word1[i]);

        }
        for (int i = 0; i < m; i++) {
            sum2.append(word2[i]);

        }

        if (sum1.toString().equals(sum2.toString())) {
            return true;
        } else return false;

    }

}
