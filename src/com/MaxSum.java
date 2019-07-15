package com;

/**
 * @author: yuanbing
 * @created time: 2019/7/15 21:50
 * @description:
 */

public class MaxSum {
    public static void main(String[] args) {
        int[] array = {1, 3, -6, 5, 7, -4};
        System.out.print(maxSum(array));
    }

    private static int maxSum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int current = 0;
        for (int i = 0; i < array.length; i++) {
            current = current + array[i];
            max = Math.max(current, max);
            current = current < 0 ? 0 : current;
        }
        return max;
    }
}
