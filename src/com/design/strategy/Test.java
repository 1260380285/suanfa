package com.design.strategy;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 17:39
 * @description:
 */

class Test {
    public static void main(String[] args) {
        Environment environment=new Environment(new AddStrategy());
        environment.calc(1,2);
    }
}
