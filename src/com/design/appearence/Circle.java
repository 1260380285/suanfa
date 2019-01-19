package com.design.appearence;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 16:50
 * @description:
 */

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle");
    }

    private void isPrivate() {
        System.out.println("isPrivate");
    }
}
