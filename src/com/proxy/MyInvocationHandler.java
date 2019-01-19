package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: yuanbing
 * @created time: 2019/1/11 15:28
 * @description:
 */

class MyInvocationHandler implements InvocationHandler{
    // 目标对象
    private Object target;

    /**
     * 构造方法
     * @param target 目标对象
     */
    public MyInvocationHandler(Object target) {
        this.target = target;
    }


    /**
     * 执行目标对象的方法
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 在目标对象的方法执行之前简单的打印一下
        System.out.println("------------------before------------------");

        // 执行目标对象的方法
        Object result = method.invoke(target, args);

        // 在目标对象的方法执行之后简单的打印一下
        System.out.println("-------------------after------------------");

        return result;
    }

    /**
     * 获取目标对象的代理对象
     * @return 代理对象
     */
    public Object getProxy() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("11--"+Thread.currentThread().getContextClassLoader());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("---"+Thread.currentThread().getContextClassLoader());
            }
        }).start();
        //System.out.println(Thread.currentThread().getContextClassLoader());
        //System.out.println(Thread.currentThread().getContextClassLoader().getParent());
        //interface传入的原因是需要创建接口的代理类 this传入是需要毁掉这边的invoke方法
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(), this);

    }
}
