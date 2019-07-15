package com;

/**
 * @author: yuanbing
 * @created time: 2019/7/14 16:04
 * @description:
 */

public class TimeComplexity {
    public static void main(String[] args) {
        print4(10);
    }

    private void print(int n) {
        System.out.print("我是时间复杂度为O（1）的常量");
    }

    private void print1(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("你好，hello world");
        }

    }

    private static void print2(int n) {
        for (int i = 1; i < n; i *= 2) {
            System.out.println("循环的次数");
        }
    }

    private static void print3(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("今天是第" + j + "天");
            }
            System.out.println("吃完了一个桃子");
        }
    }

    private static void print4(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    System.out.println("今天是第" + j + "天");
                }
            }
            System.out.println("吃完了一个桃子");
        }
    }

    private static long print5(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return print5(n - 1) + print5(n - 2);
        }
    }
}
