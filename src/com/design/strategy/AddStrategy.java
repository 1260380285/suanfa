package com.design.strategy;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 17:37
 * @description:
 */

class AddStrategy implements Strategy {

    @Override
    public void strategy(int number) {
        System.out.println(number);
    }
}
