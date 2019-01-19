package com.design.decorate;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 17:02
 * @description:
 */

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square");
    }
}
