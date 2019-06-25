package com.annotation;

import java.lang.reflect.Method;

/**
 * @author: yuanbing
 * @created time: 2019/1/22 10:59
 * @description:在子类中，覆盖父类方法的方法，是不能继承父类里注解的值的。
                在子类中，父类类级别的注解是可以在子类中获取的。
                在子类中，没有覆盖父类的方法的方法，可以获取到在父类方法中注解的注解
 */

public class InheritedAnnotationTest {

    public static void main(String[] args) throws SecurityException, NoSuchMethodException{

        Class<SubClassImpl> clazz = SubClassImpl.class;

        Method method = clazz.getMethod("abstractMethod", new Class[]{});
        if(method.isAnnotationPresent(InheritedAnnotation.class)){
            InheritedAnnotation mt = method.getAnnotation(InheritedAnnotation.class);
            System.out.println("子类实现的抽象方法继承到父类抽象方法中的Annotation,其信息如下：");
            System.out.println(mt.name());
        }else{
            System.out.println("子类实现的抽象方法没有继承到父类抽象方法中的Annotation");
        }

        Method methodOverride = clazz.getMethod("doExtends", new Class[]{});
        if(methodOverride.isAnnotationPresent(InheritedAnnotation.class)){
            InheritedAnnotation ma = methodOverride.getAnnotation(InheritedAnnotation.class);
            System.out.println("子类doExtends方法继承到父类doExtends方法中的Annotation,其信息如下：");
            System.out.println(ma.name());
        }else{
            System.out.println("子类doExtends方法没有继承到父类doExtends方法中的Annotation");
        }

        if(clazz.isAnnotationPresent(InheritedAnnotation.class)){
            InheritedAnnotation ma = clazz.getAnnotation(InheritedAnnotation.class);
            System.out.println("子类继承到父类类上Annotation,其信息如下：");
            System.out.println(ma.name());
        }else{
            System.out.println("子类没有继承到父类类上Annotation");
        }
    }

}
