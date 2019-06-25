package com.annotation;


import java.lang.reflect.Method;

@HelloAnnotation(say = "Hi TestHelloAnnotation")
class TestHelloAnnotation {

   // @TestAnnotation(say = "i am main")
    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        //这里的method包含了父类和当前类所有的方法
        Method[] methods = TestHelloAnnotation.class.getMethods();
        for (Method method : methods) {
           // System.out.println(method.getName());
            //排除掉所有的父类的方法，不然调试次数走的太多
            if("test".equals(method.getName())){
                TestAnnotation annotation = method.getAnnotation(TestAnnotation.class);
                if (annotation != null) {
                    System.out.println(annotation.toString());
                    System.out.println(annotation.say());
                }
            }


        }
    }

    @TestAnnotation(say = "i am test")
    public void test(){

    }
}
