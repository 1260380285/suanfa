package com.design.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 17:26
 * @description:
 */

class RealSubject implements Subject {

    private List<Observer> list = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        list.add(observer);
        System.out.println("attach" + list.size());
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
        System.out.println("detach" + list.size());
    }

    @Override
    public void change(String state) {
        for (Observer o : list) {
            o.update(state);
        }
    }
}
