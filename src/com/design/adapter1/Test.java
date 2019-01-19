package com.design.adapter1;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 15:53
 * @description: 对象适配器
 */

class Test {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.employ();
        target.sample();
    }
}
