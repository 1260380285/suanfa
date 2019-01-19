package com.annotation;


import java.lang.reflect.Method;

@HelloAnnotation(say = "Hi Allen")
class TestHelloAnnotation {

    @TestAnnotation
    public static void main(String[] args) {
        int a = 3;
        String name = "yuanbing";
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Method[] methods = TestHelloAnnotation.class.getMethods();
        for (Method method : methods) {
            TestAnnotation annotation = method.getAnnotation(TestAnnotation.class);
            if (annotation != null) {
                System.out.println(annotation.say() + a + name);
            }

        }

    }

    @TestAnnotation
    public static void test() {
        System.out.println("test");
    }
}
