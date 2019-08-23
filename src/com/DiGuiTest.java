package com;

/**
 * @author: yuanbing
 * @created time: 2019/8/22 11:09
 * @description:
 */

public class DiGuiTest {

    public static void main(String[] args) {
        //System.out.println(sum(1));
        System.out.println(add(8, "head"));
    }

    /**
     * @param num 求和方法
     */
    public static int sum(int num) {
        if (num == 100) {
            return 100;
        }
        return num + sum(num + 1);
    }

    public static String add(int a, String tag) {
        if (a > 10) {
            System.out.println(a + ":" + tag + ":" + "return");
            return a + ":" + tag;
        }
        System.out.println(a + ":" + tag);
        a = a + 1;
        add(a, "left");
        add(a, "right");
        return a + ":" + tag;
    }

}
