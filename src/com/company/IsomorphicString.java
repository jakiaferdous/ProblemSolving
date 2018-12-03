package com.company;
import java.util.Map;
import java.util.HashMap;

/**
 * Given two strings s and t, determine if they are isomorphic. Two strings are isomor- phic if the characters in s can be replaced to get t.
For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
*/

public class IsomorphicString {
    public static void main(String[] args) {

    }


    public static boolean isomorphicString(String s, String t){

        if(s == null || t == null){
            return false;
        }
        if (s.length() != t.length()){
            return false;
        }
        if(s.length() == 1 && t.length() == 1){
            return true;
        }

        Map<Character,Character> map = new HashMap<>();

        for(int i = 0 ; i < s.length();i++){

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);


            if(map.containsKey(ch1)){
               if(map.get(ch1) != ch2){
                   return false;
               }
                map.put(ch1,ch2);
            }

        }
        return true;
    }
}
