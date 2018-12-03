package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Design and implement a TwoSum class. It should support the following operations: add and find
 * add - Add the number to an internal data structure.
 * find - Find if there exists any pair of numbers which sum is equal to the value.
 * *For example
 * add(1);
 * add(3);
 * add(5);
 * find(4) -> true
 * find(7) -> false
 */

public class TwoSumII {
    public static Map<Integer, Integer> map;


    public static void main(String[] args) {
        add(1);
        add(2);
        add(4);
        add(1);
        System.out.println(find(0));

    }

    public static void add(int number) {

        map = new HashMap<>();
        if (map.containsKey(number)) {
            int value = map.get(number);
            map.put(number, value + 1);
        }
        map.put(number, 1);

    }

    public static boolean find(int target) {

        for (int i : map.keySet()) {
            if (map.containsKey(i - target)) {
                int value = target - i;
                if (value == i && map.get(i) < 2) {
                    continue;
                }
            }
            return true;
        }
        return false;

    }
}
