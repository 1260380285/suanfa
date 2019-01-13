package com.fanxing;

/**
 * @author: yuanbing
 * @created time: 2018/4/26 19:58
 * @description:
 */

class Test<T> {

    public T one;

    public T show(T one) {
        return one;
    }


}

//因为泛型类中的泛型参数的实例化是在定义对象的时候指定的，而静态变量和静态方法不需要使用对象来调用。
// 对象都没有创建，如何确定这个泛型参数是何种类型，所以当然是错误的。
class Test2<T> {

    /* public static T one;

     public static T show(T one) {
         return one;
     }*/
    public static <V> V show(V one) {//这是正确的
        return null;
    }
}