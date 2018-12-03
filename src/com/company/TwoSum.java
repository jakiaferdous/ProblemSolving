package com.company;

/*
  Given an array of integers, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
For example:
Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 2,15};
        int target = 9;
        boolean isTrue = twoSum(numbers, target);
        //System.out.println(isTrue);

        ArrayList<int[]> list = new ArrayList<>();

        int[] index = twoSum2(numbers, target);
        for (int s : index) {
            System.out.println(s);
        }

    }

    public static int[] twoSum2(int[] array, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int needed = target - array[i];
            if (map.containsKey(needed)) {
                return new int[]{i, map.get(needed)};
            }
            map.put(array[i], i);
        }
        return null;
    }

    public static boolean twoSum(int[] array, int target) {

        if (array.length <= 1) {
            throw new NullPointerException();
        }
        Arrays.sort(array);
        int min = 0;
        int max = array.length - 1;
        int sum = 0;

        while (min < max) {
            sum = array[min] + array[max];
            if (sum == target) {
                return true;
            } else if (sum > target) {
                max--;
            } else {
                min--;
            }
        }
        return false;

    }

}
