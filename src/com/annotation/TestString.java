package com.annotation;

/**
 * @author: yuanbing
 * @created time: 2019/1/19 16:35
 * @description:
 */

class TestString {

    public String incStringJoint(int a, int b, int c, int d, int e) {
        String str = "a";
        String str1 = str + "b" + a + b + c + d + e;
        return str1;
    }

//    public String incStringBuffer() {
//        StringBuffer str = new StringBuffer(3);
//        str.append("a");
//        str.append("b");
//        return str.toString();
//    }

    public static void main(String[] args) {
        TestString testString = new TestString();
       // testString.incStringBuffer();
        testString.incStringJoint(1, 2, 3, 4, 5);
    }
}
