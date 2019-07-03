package com;

/**
 * @author: yuanbing
 * @created time: 2019/7/3 15:56
 * @description:
 */

public class ZeroNumber {
    public static void main(String[] args) {
        long ss = getZeroNumberByAll(123456);
        long s = getZeroNumber(1000);
        long s1 = getZeroNumber1(123456);
        System.out.println("s:" + s + ",s1:" + s1 + ",ss:" + ss);

    }

    /***
     * 通过b的分析，每次对5取余，获取0
     * 的个数
     */
    private static long getZeroNumberByAll(int number) {
        if (number < 0) {
            return 0;
        }
        long res = 0;
        long cur;
        for (int i = 5; i < number + 1; i = i + 5) {
            cur = i;
            while (cur % 5 == 0) {
                res++;
                cur /= 5;
            }
        }
        return res;
    }

    /***
     * 通过c的分析，获取0的个数
     */
    private static long getZeroNumber(int number) {
        if (number < 0) {
            return 0;
        }
        long res = 0;
        while (number != 0) {
            res += number / 5;
            number /= 5;
        }
        return res;
    }


    private static long getZeroNumber1(int number) {
        long count = 0;
        long temp = number / 5;
        while (temp != 0) {
            count += temp;
            temp /= 5;
        }
        return count;
    }
}
