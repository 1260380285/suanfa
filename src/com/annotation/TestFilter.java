package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author: yuanbing
 * @created time: 2019/1/19 10:42
 * @description:
 */

class TestFilter {

    @Filter(name = "/allen")
    @Filter(name = "/lily")
    public String schema;

    public static void main(String[] args) {
        Field[] declaredFields = TestFilter.class.getDeclaredFields();
        for (Field field : declaredFields) {
            //这个获取出来是null
            Filter annotation = field.getAnnotation(Filter.class);
            System.out.println(annotation);
            Filters annotations = field.getAnnotation(Filters.class);
            Filter[] value = annotations.value();
            for (Filter filter : value) {
                System.out.println(filter.name());
            }
        }
    }
}
