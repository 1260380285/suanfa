package com.proxy;

/**
 * @author: yuanbing
 * @created time: 2019/1/11 15:41
 * @description:
 */

public class Test {

    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // 实例化目标对象
        UserService userService = new UserServiceImpl();

        // 实例化InvocationHandler
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);

        // 根据目标对象生成代理对象
        UserService proxy = (UserService) invocationHandler.getProxy();
        System.out.println(proxy.getClass().getName());
        // 调用代理对象的方法
        proxy.add();
    }
}
