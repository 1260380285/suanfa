package com.testSuper;

/**
 * @author: yuanbing
 * @created time: 2019/1/9 14:07
 * @description:
 */

public class Child extends Base{
    private int a = 2;
    @Override
    public void print(){
        System.out.println(a);
    }
}
