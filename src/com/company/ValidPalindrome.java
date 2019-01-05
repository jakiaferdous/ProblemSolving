package com.company;

/*Given a string, determine if it is a palindrome, considering only alphanumeric charac- ters and ignoring cases.
For example, "Red rum, sir, is murder" is a palindrome, while "Programcreek is awesome" is not.
Note: Have you consider that the string might be empty? This is a good question to ask during an interview.
For the purpose of this problem, we define empty string as valid palindrome.*/

import java.util.Stack;

public class ValidPalindrome {

    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";
        System.out.println(isValidPldme(str));

    }

    public static boolean isAlphaNum(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
            return true;
        }
        return false;

    }

    public static boolean isValidPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(str);
        char[] charArray = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (charArray[i] != charArray[j]) {
                return false;
            }
            i++;
            j--;

        }
        return true;

    }

    public static boolean isValidPldme(String str) {

        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len = str.length();
        int newSize = len / 2;
        int index = 0;

        Stack<Character> stack = new Stack<>();
        while (index < newSize) {
            stack.push(str.charAt(index));
            index++;
        }

        if (len % 2 == 1) {
            index++;
        }

        while (index < len) {
            char c = stack.pop();
            if (c != str.charAt(index)) {
                return false;
            }
            index++;
        }

        return true;
    }


}
