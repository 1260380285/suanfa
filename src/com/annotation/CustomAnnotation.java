package com.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: yuanbing
 * @created time: 2019/1/19 11:01
 * @description:
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CustomAnnotation {
    //注解参数类型可以是1-6中任一种,包括枚举
     enum Skill {
        JAVA, ANDROID, IOS
    }

    Skill mySkill() default Skill.ANDROID;

    String attr1();

    //可以使用default设置默认值
    int attr2() default 100;

    //修饰符只能用public
     boolean attr3() default false;
}
