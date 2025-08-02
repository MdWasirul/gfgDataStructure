package com.sandip.String;
//Leetcode 567 Permutation in string
public class permutation {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        String s3 = "ab";
        String s4 = "eidboaoo";
        System.out.println(checkInclusion(s1, s2));
    }

    static boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;

        }
        int windSize = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            int windIndex = 0, idx = i;
            int[] windFreq = new int[26];
            while (windIndex < windSize && idx < s2.length()) {
                windFreq[s2.charAt(idx) - 'a']++;
                windIndex++;
                idx++;

            }

            if (isFreqSame(freq, windFreq)) {
                return true;
            }


        }
        return false;
    }

    static boolean isFreqSame(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }

        }
        return true;
    }
}
