package com;

/**
 * @author: yuanbing
 * @created time: 2019/6/30 14:12
 * @description:
 */

public class Count {

    public static void main(String[] args) {
        int count = count(18922);
        int countBy1 = countBy1(18922);
        System.out.println(count + ":" + countBy1);
    }

    /**
     * 上面每次右移一位的做法
     *
     * @param num 输入的值
     * @return 1的个数
     */
    private static int count(int num) {
        int res = 0;
        while (num != 0) {
            res += num & 1;
            num = num >>> 1;
        }
        return res;
    }

    /***
     * 通过1的个数计算
     * @param num 输入的值
     * @return 1的个数
     */
    private static int countBy1(int num) {
        int res = 0;
        while (num != 0) {
            num = num & (num - 1);
            res++;
        }
        return res;
    }
}
