package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
Given a string containing just the characters ’(’ and ’)’, find the length of the longest valid (well-formed)
parentheses substring.

For "(()", the (()(()()longest valid parentheses substring is "()", which has length = 2. An- other example is ")()())", where
        the longest valid parentheses substring is "()()", which has length = 4.
        */

public class LongestValidParen {


    public static Map<Character, Character> map;

    public static void main(String[] args) {
        String str = "(()(()()";
        char[] charArray = str.toCharArray();
        int number = longestValidParentheses(charArray);
        System.out.println(number);

    }

    public static int longestValidParentheses(char[] array) {

        map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        int count = 0;
        int max = 0;

        if(count < 0){
            throw new NullPointerException();
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                stack.push(array[i]);
                count++;

            } else if (map.containsValue(array[i])) {
                if (stack.isEmpty()) {
                    if(count> max) {
                        max = count;
                        count=0;
                    }
                    continue;
                }
                char paren = stack.pop();
                switch (array[i]) {

                    case ']':
                        if (paren == '[') {
                            count ++;
                            break;
                        } else {
                            continue;
                        }

                    case '}':
                        if (paren == '{') {
                            count ++;
                            break;
                        } else {
                            continue;
                        }
                    case ')':
                        if (paren == '(') {
                            count --;
                            break;
                        } else {
                            continue;
                        }

                }

            }
        }

        return count;
    }


}

