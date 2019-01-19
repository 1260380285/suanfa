package com.design.appearence;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 16:54
 * @description:外观模式
 */

class Test {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
