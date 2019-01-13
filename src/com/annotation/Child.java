package com.annotation;

/**
 * @author: yuanbing
 * @created time: 2018/12/6 16:41
 * @description:
 */

class Child extends Parent {

    /***
     * 源代码级别 Source
     */
    @Override
    public void getName() {
        System.out.println("Child");
    }

}
