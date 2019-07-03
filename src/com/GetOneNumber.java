package com;

/**
 * @author: yuanbing
 * @created time: 2019/7/2 01:04
 * @description:
 */

public class GetOneNumber {

    /**
     * 获取只出现一次的数
     *
     * @param array 当前的数组
     * @param k     k进制
     * @return 只出现一次的值
     */
    public static int getOnlyOneTimeNumber(int[] array, int k) {
        int[] kBinary = new int[32];
        for (int i = 0; i < array.length; i++) {
            getOnlyOneKBinary(kBinary, array[i], k);
        }
        int number = get10DecimalFromKBinary(kBinary, k);
        return number;

    }

    /**
     * 获得中间的步骤,获得只出现一次的k进制数
     *
     * @param kBinary k进制的初始化数组
     * @param value   当前循环的值
     * @param k       k进制
     */
    public static void getOnlyOneKBinary(int[] kBinary, int value, int k) {
        int[] res = getKBinaryFrom10Decimal(value, k);
        for (int i = 0; i < kBinary.length; i++) {
            kBinary[i] = (kBinary[i] + res[i]) % k;
        }

    }

    /***
     * 将十进制的整数转换成k进制的数
     * @param value 当前的值
     * @param k k进制
     * @return k进制的数
     */
    public static int[] getKBinaryFrom10Decimal(int value, int k) {
        int[] res = new int[32];
        int index = 0;
        while (value != 0) {
            res[index++] = value % k;
            value = value / k;
        }
        return res;
    }

    /**
     * 将k进制的数转换成的十进制的整数
     *
     * @param kBinary k进制的数
     * @param k       k进制
     * @return 十进制数
     */
    public static int get10DecimalFromKBinary(int[] kBinary, int k) {
        int res = 0;
        for (int i = kBinary.length - 1; i >= 0; i--) {
            res = res * k + kBinary[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 5, 2};
        //k表示其他数出现的次数
        int k = 3;
        System.out.println(getOnlyOneTimeNumber(arr, k));

    }
}
