package com.design.observe;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 17:30
 * @description:
 */

class Test {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Observer observer = new RealObserver();
        subject.attach(observer);
        subject.change("hi yuanbing");
        subject.detach(observer);
    }
}
