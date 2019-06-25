package com;

/**
 * @author: yuanbing
 * @created time: 2019/6/17 20:37
 * @description:
 */

public class IsRotate {

//    public boolean isRotateDigit(String a, String b) {
//        if (a == null || b == null || a.length() != b.length()) {
//            return false;
//        }
//        String a2 = a + a;
//        return getIndexOf(a2, b) != -1;
//    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 1, 3, 4, 5, 3, 4, 5};
        System.out.println(printSingle(numbers));
    }

    private static int printSingle(Integer[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[0] ^= nums[i];
        }
        return nums[0];
    }
}
