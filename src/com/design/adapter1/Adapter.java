package com.design.adapter1;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 15:51
 * @description:
 */

class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void sample() {
        System.out.println("sample");
    }

    @Override
    public void employ() {
        this.adaptee.employ();
    }
}
