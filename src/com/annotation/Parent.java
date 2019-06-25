package com.annotation;

import java.lang.annotation.Inherited;

/**
 * @author: yuanbing
 * @created time: 2018/12/6 16:40
 * @description:
 */

public abstract class Parent {

    public abstract void getName();

    /***
     * 运行是级别
     */
    @Deprecated
    public void getPassword() {
        System.out.println("getPassword");
    }
}
