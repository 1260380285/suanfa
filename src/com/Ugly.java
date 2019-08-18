package com;

/**
 * @author: yuanbing
 * @created time: 2019/6/19 12:36
 * @description:
 */

public class Ugly {
    public static void main(String[] args) {
        System.out.println("==" + uglyNumber(1500));
    }

    public static int uglyNumber(int number) {
        if (number <= 0) {
            return 0;
        }
        int[] arr = new int[number];
        arr[0] = 1;
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int nextNumber = 1;
        while (nextNumber < number) {
            int min = Math.min(Math.min(arr[temp1] * 2, arr[temp2] * 3), arr[temp3] * 5);
            arr[nextNumber] = min;

            while (arr[temp1] * 2 <= min) {
                temp1++;
            }
            while (arr[temp2] * 3 <= min) {
                temp2++;
            }
            while (arr[temp3] * 5 <= min) {
                temp3++;
            }
            nextNumber++;
        }
        return arr[number - 1];
    }

}
