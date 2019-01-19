package com.design.decorate;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 17:03
 * @description:
 */

abstract class ShapeDecorate implements Shape {
    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw(){
        this.shape.draw();
    }
}
