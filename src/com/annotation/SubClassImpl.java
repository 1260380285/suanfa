package com.annotation;

/**
 * @author: yuanbing
 * @created time: 2019/1/22 10:59
 * @description:
 */

public class SubClassImpl extends AbstractAnnotation {

    @Override

    public void abstractMethod(){

        System.out.println("子类实现抽象父类的抽象方法");

    }

}


