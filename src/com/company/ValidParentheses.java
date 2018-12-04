package com.company;

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

/* Given a string containing just the characters ’(’, ’)’, ’’, ’’, ’[’ and ’]’, determine if the input string is valid.
 The brackets must close in the correct order, "()" and "()[]" are all valid but "(]" and "([)]" are not.
  */

public class ValidParentheses {

    public static Map<Character, Character> map;

    public static void main(String[] args) {
        String str = "}[({})]";
        char[] charArray = str.toCharArray();
        boolean isValidParentheses = isValidParentheses(charArray);
        System.out.println(isValidParentheses);

    }

    public static boolean isValidParentheses(char[] array) {

        map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');


        Stack <Character> stack = new Stack<>();

        for(int i = 0 ; i < array.length; i++){
            if(map.containsKey(array[i])){
                stack.push(array[i]);

            }else if(map.containsValue(array[i])){
                if(stack.isEmpty()){
                    return false;
                }
                char paren = stack.pop();
                return matchParen(array[i],paren);
            }
        }
        return true;
    }

    public static boolean matchParen(char a, char paren){

        switch (a){
            case ']' : return paren == '[';
            case '}' : return paren == '{';
            case ')' : return paren == '(';
        }
        return false;
    }

}
