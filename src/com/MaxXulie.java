package com;

import java.util.HashMap;

/**
 * @author: yuanbing
 * @created time: 2019/9/15 10:42
 * @description:
 */

public class MaxXulie {

    public static int getMaxXulie(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int max = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
                //判断是否有左序列，有的话，获取序列长度
                if (map.containsKey(array[i] - 1)) {
                    max = Math.max(max, getCurrentMaxXulie(map, array[i] - 1, array[i]));
                }
                //判断是否有右序列，有的话，获取序列长度
                if (map.containsKey(array[i] + 1)) {
                    max = Math.max(max, getCurrentMaxXulie(map, array[i], array[i] + 1));
                }
            }
        }
        return max;
    }

    //更新map的序列左右两边的数的value值
    public static int getCurrentMaxXulie(HashMap<Integer, Integer> map, int less, int more) {
        //获取左边的数，也就是序列最左边的数
        int left = less - map.get(less) + 1;
        //获取右边的数，也就是序列最右边的数
        int right = more + map.get(more) - 1;
        //获取当前序列的长度
        int len = right - left + 1;
        map.put(left, len);
        map.put(right, len);
        return len;
    }

    public static void main(String[] args) {
        int[] array = {1, 20, 4, 6, 5, 10, 5};
        System.out.println(getMaxXulie(array));

    }
}
