package com.jtest;

/**
 * @author: yuanbing
 * @created time: 2018/3/29 13:24
 * @description:
 */

public class TestClass {

    public static void main(String[] args) {
       /* TestClass testClass = new TestClass();
        System.out.println(testClass.getSum());
        testClass.print();*/

       // Dog dog = new Dog(2);

    }
}

class Animal {
    /*public Animal() {
        System.out.println("1");
    }*/

    public Animal(int a) {
        System.out.println("1" + "ddd");
    }
}

class Dog extends Animal {
    public Dog() {
        super(2);
        System.out.println("3");
    }

   /* public Dog(int a) {
        System.out.println("3" + "ddd");
    }*/
}