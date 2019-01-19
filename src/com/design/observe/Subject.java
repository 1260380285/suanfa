package com.design.observe;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 17:25
 * @description:
 */

interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void change(String state);
}
