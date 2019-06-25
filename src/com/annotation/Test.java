package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author: yuanbing
 * @created time: 2018/12/6 16:37
 * @description:
 */

public class Test {
    private static final Integer s=1;

    public static void main(String[] args) {
        Child child=new Child();
        child.getName();
        child.getPassword();

        getAnnotationValue();
    }


    public static void getAnnotationValue(){
        try {
            Class clazz =Class.forName("com.annotation.Test");
            Annotation[] aArray= clazz.getMethod("getAnnotaion").getAnnotations();
            for( Annotation an :aArray){
                System.out.println(an);
                if( an instanceof MyAnnotation){
                    MyAnnotation tag = (MyAnnotation) an;
                    System.out.println("tag.name():"+tag.name());
                    System.out.println("tag.age():"+tag.age());
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @MyAnnotation(name = "yuanbing", age = 20)
    public  void getAnnotaion(){
        int a=s;
        System.out.println("getAnnotation"+a);
    }

}
