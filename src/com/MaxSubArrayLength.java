package com;

import java.util.HashMap;

/**
 * @author: yuanbing
 * @created time: 2019/8/29 22:04
 * @description:
 */

public class MaxSubArrayLength {
    public static int getSubMaxLength(int[] array, int k) {
        if (array == null || array.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>(array.length);
        map.put(0, -1);
        int length = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (map.containsKey(sum - k)) {
                length = Math.max(i - map.get(sum - k), length);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return length;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 4, 5, 6, 7};
        System.out.println(getSubMaxLength(arr, 11));

    }
}
