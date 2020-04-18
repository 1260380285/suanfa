package com.gongzhonghao;

/**
 * @author: yuanbing
 * @created time: 2020/4/12 12:07
 * @description:
 */

public class InitOrder {

    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println("-------------------");
        p = new Child();

    }

    static class Child extends Parent {
        static {
            System.out.println("child static init");

        }

        {
            System.out.println("child  init");
        }

        public Child() {
            System.out.println("child construction init");
        }
    }

    static class Parent {

        public Parent() {
            System.out.println("parent construction init");
        }

        static {
            System.out.println("parent static init");

        }

        {
            System.out.println("parent  init");
        }


    }
}
