package com.annotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author: yuanbing
 * @created time: 2019/1/22 10:58
 * @description:
 */

@Inherited

@Retention(RetentionPolicy.RUNTIME)

public @interface InheritedAnnotation {

    String name();

}
