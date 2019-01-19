package com.design.adapter;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 15:25
 * @description:
 */

class Adapter extends Adaptee implements Target {

    @Override
    public void sample() {
        System.out.println("sample");
    }

    @Override
    public void employ() {
        super.employ();
    }
}
