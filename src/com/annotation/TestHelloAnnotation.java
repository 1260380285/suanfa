package com.annotation;




@HelloAnnotation(say = "Hi Allen")
class TestHelloAnnotation {

    public static void main(String[] args) {
        int a=3;
        String name="yuanbing";
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        HelloAnnotation annotation = TestHelloAnnotation.class.getAnnotation(HelloAnnotation.class);
        System.out.println(annotation.say()+a+name);
    }
}
