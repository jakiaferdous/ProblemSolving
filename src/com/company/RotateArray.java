package com.company;

public class RotateArray {

    /* Rotate an array of n elements to the right by k steps.
    For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
    How many different ways do you know to solve this problem? */


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int n = 7;
        int k = 4;
        rotateArray2(array, k);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }


    public static int[] rotateArray(int[] a, int k) {

        int[] b = new int[a.length];
        int j = 0;
        for (int i = k; i < a.length; i++, j++) {
            b[j] = a[i];
        }
        int p = 0;
        while (p < k) {
            b[j] = a[p];
            j++;
            p++;
        }
        return b;

    }


    public static void rotateArray2(int[] array, int k) {

        int min = 0;
        int max = array.length - 1;
        reverseArray(array, min, max);
        reverseArray(array, 0, max - k);
        reverseArray(array,k,max);

    }

    public static void reverseArray(int[]a, int min, int max) {

        while (min < max) {
            int tmp = a[min];
            a[min] = a[max];
            a[max] = tmp;
            min++;
            max--;

        }
    }


}
