package com.design.observe;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 17:27
 * @description:
 */

class RealObserver implements Observer {

    @Override
    public void update(String state) {
        System.out.println("新状态" + state);
    }
}
