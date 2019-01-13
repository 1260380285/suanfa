package com.fanxing;

/**
 * @author: yuanbing
 * @created time: 2018/4/26 20:30
 * @description:
 */

public class TestT {
    public static void main(String[] args)
    {
        staticFunction();
    }

    static TestT book = new TestT();
    {
        System.out.println("书的普通代码块");
    }
    static
    {
        System.out.println("书的静态代码块");
    }



    TestT()
    {
        System.out.println("书的构造方法");
        System.out.println("price=" + price +",amount=" + amount);
    }

    public static void staticFunction(){
        System.out.println("书的静态方法");
    }

    int price = 110;
    static int amount = 112;

}
