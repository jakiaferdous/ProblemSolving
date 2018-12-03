package com.company;

public class Atoi {

    public static void main(String[] args) {
        String str = "+145";
        int number = atoi(str);
        System.out.println(number);
    }

    public static int atoi(String str) {

        //empty strings
        if (str == null) {
            throw new NullPointerException();
        }

        // white spaces
        str = str.trim();

        // +/- sign
        boolean isNegative = false;
        int sign = 0;
        if (str.charAt(sign) == '-') {
            isNegative = true;
            sign++;
        } else if (str.charAt(sign) == '+') {
            sign++;
        }

        int result = 0;
        if (str.charAt(sign) <= '9' && str.charAt(sign) >= '0') {
            while (sign < str.length()) {
                result = result * 10 + str.charAt(sign) - '0';
                sign++;
            }
        }

        //handle min & max
        if (result < Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        }

        if (result > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        }

        if (isNegative) {
            result = -result;
        }

        return result;
    }
}
