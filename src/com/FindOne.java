package com;

/**
 * @author: yuanbing
 * @created time: 2019/6/30 16:28
 * @description:
 */

public class FindOne {
    /**
     * 算法思想
     * 两个相同的数异或得0,一个数与0异或得它本身
     *
     * @param array 输入的数组
     */
    public static void printOnlyOneNumber(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result ^= array[i];
        }
        System.out.println(result);
    }

    /**
     * 找出两个奇数的算法思想:
     * 一趟异或下来,最终的结果即为那两个奇数异或的结果,
     * 如果其结果不为0,则说明至少存在这两个数中的某一个数的某一位不全为0
     * 那么可以根据这个不同的位,将数组分成两个部分
     * 再对这两个独立的部分,分别异或,就可以得到这两个奇数了
     *
     * @param array 输入的数组
     */
    public static void printOnlyOneNumber2(int[] array) {
        int twoSingleNumber = 0;
        int oneNumber = 0;
        for (int i = 0; i < array.length; i++) {
            twoSingleNumber ^= array[i];
        }
        int oneRight = twoSingleNumber & (~twoSingleNumber + 1);
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & oneRight) != 0) {
                oneNumber ^= array[i];
            }
        }
        System.out.println(oneNumber + "-" + (oneNumber ^ twoSingleNumber));
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 6, 7, 12, 5, 6, 7, 1};
        printOnlyOneNumber(arr1);

        int[] arr2 = {1, 5, 6, 7, 12, 5, 6, 7};
        printOnlyOneNumber2(arr2);

    }
}
