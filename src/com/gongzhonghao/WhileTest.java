package com.gongzhonghao;

/**
 * @author: yuanbing
 * @created time: 2020/3/10 22:28
 * @description:
 */

public class WhileTest {

    public static void main(String[] args) {
        int x = 0;
        System.out.println("第一段代码输出的结果：");
        while (x > 0) {
            System.out.println("x=" + x);
        }
        System.out.println("第二段代码输出的结果：");
        do {
            System.out.println("x=" + x);
        } while (x > 0);
    }

}
