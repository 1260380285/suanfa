package com;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: yuanbing
 * @created time: 2019/6/23 14:23
 * @description:
 */

public class TwoNum {

    public static void main(String[] args) {
        int[] nums = new int[]{-4, -3, 4, 7, 9, 77};
        int[] num = printNum(nums, 1);
       // System.out.println(num);
        System.out.println(num);
    }

    //通过两层for循环
    private static int[] printNum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return  null;
    }

    //通过map迭代
    private static int[] print(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
