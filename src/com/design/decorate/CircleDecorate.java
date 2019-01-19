package com.design.decorate;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 17:10
 * @description:
 */

class CircleDecorate extends ShapeDecorate{

    @Override
    public void draw() {
        super.draw();
        printAfterDecorate();
    }

    private void printAfterDecorate(){
        System.out.println("printAfterDecorate");
    }
}
