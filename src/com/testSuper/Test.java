package com.testSuper;

/**
 * @author: yuanbing
 * @created time: 2019/1/9 14:04
 * @description:
 */

public  class Test {

    //打印0和2  父类护士话时子类还没有初始化
    public static void main(String[] args) {
        Base base=new Child();
        base.print();
    }
}
