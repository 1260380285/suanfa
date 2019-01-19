package com.design.adapter;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 15:35
 * @description:类适配器
 */

class Test {
    public static void main(String[] args) {
        Target adapter=new Adapter();
        adapter.sample();
        adapter.employ();
    }
}
