package com.design.decorate;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 17:12
 * @description: 装饰者模式
 */

class Test {
    public static void main(String[] args) {
        ShapeDecorate shapeDecorate = new CircleDecorate();
        shapeDecorate.setShape(new Circle());
        shapeDecorate.draw();
    }
}
