package com.company;

/*
Given an input string, reverse the string word by word. A word is defined as a se- quence of non-space characters.
The input string does not contain leading or trailing spaces and the words are always separated by a single space.
For example, Given s = "the sky is blue", return "blue is sky the". Could you do it in-place without allocating extra space?
 */

public class ReverseWordsInString {


    public static void main(String[] args) {

        String sentence = "The sky is blue ";
        char[] c = reverseWordInaAString(sentence);
        System.out.println(c);
    }


    public static char[] reverseWordInaAString(String sentence) {

        if (sentence.length() < 1) {
            throw new NullPointerException("String lenght is less than 1.");
        }

        char[] sen = sentence.toCharArray();
        int j = 0;
        for (int i = 0; i < sen.length; i++) {

            if (sen[i] == ' ') {
                reverseWord(sen, j, i - 1);
                j = i + 1;
            }
        }
        reverseWord(sen, 0, sen.length - 1);
        return sen;

    }

    public static void reverseWord(char[] s, int min, int max) {

        while (min < max) {
            char tmp = s[min];
            s[min] = s[max];
            s[max] = tmp;
            min++;
            max--;
        }

    }
}
