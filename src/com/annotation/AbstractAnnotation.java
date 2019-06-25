package com.annotation;

/**
 * @author: yuanbing
 * @created time: 2019/1/22 10:58
 * @description:
 */

@InheritedAnnotation(name="AbstractAnnotation")
public abstract class AbstractAnnotation {

    @InheritedAnnotation(name="abstractMethod")
    public abstract void abstractMethod();

    @InheritedAnnotation(name="doExtends")
    public void doExtends(){

        System.out.println(" AbstractAnnotation doExtends Method ... ");

    }

}