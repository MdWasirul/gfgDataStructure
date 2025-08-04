package com.sandip.String;

import java.util.Arrays;

//1859. Sorting the Sentence
/*
A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
 */
public class sortSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortedSentence(s));
    }

    static String sortedSentence(String s) {
        String[] words = s.split(" ");

        String[] sortedWords = new String[words.length];

        for (String word : words) {
            int index = word.charAt(word.length() - 1) - '1';
            sortedWords[index] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", sortedWords);
    }
}
