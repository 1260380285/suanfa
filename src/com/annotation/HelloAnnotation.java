package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: yuanbing
 * @created time: 2018/12/31 15:42
 * @description:
 */

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface HelloAnnotation {

    String say() default "Hi yuanbing";
}
