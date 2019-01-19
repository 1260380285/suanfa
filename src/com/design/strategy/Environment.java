package com.design.strategy;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 17:38
 * @description:
 */

class Environment {

    private Strategy strategy;

    public Environment(Strategy strategy) {
        this.strategy = strategy;
    }

    public void calc(int a, int b) {
        this.strategy.strategy(a + b);
    }
}
