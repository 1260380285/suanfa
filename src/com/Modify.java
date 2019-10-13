package com;

/**
 * @author: yuanbing
 * @created time: 2019/10/13 21:49
 * @description:
 */

public class Modify {

    public static void changePosition(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        int even = 0;
        int odd = 1;
        int end = array.length - 1;
        while (even <= end && odd <= end) {
            //printArray(array);
            if ((array[end] & 1) == 0) {
                swap(array, end, even);
                even += 2;
            } else {
                swap(array, end, odd);
                odd += 2;
            }
            printArray(array);
            System.out.println("even:" + even + ",odd:" + odd);
        }
    }

    public static void swap(int[] array, int end, int current) {
        int tmp = array[end];
        array[end] = array[current];
        array[current] = tmp;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 6, 5, 1, 7, 8, 9, 3};
        changePosition(array);
    }
}
