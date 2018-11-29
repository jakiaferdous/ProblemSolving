package com.company;

import java.util.Stack;

/*
  Evaluate the value of an arithmetic expression in Reverse Polish Notation. Valid op- erators are +, -, *, /.
  Each operand may be an integer or another expression. For example:
 ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */


public class ReversePolishNotation {

    public static void main(String[] args) {

        String[] array = {"2", "1", "+", "3", "*"};
        int sum = reversePolishNotation(array);
        System.out.println(sum);
    }

    public static int reversePolishNotation(String[] str) {

        Stack<Integer> stack = new Stack<>();
        String operator = "+-*/";

        for (String s : str) {
            if (operator.contains(s)) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(operation(s, num1, num2));
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();

    }

    private static int operation(String operator, int num1, int num2) {

        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            default:
                return num1 / num2;
        }

    }


}

