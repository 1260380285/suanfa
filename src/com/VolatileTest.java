package com;

/**
 * @author: yuanbing
 * @created time: 2019/10/20 22:52
 * @description:
 */

public class VolatileTest {

    public static void main(String[] args) {
        //System.out.print(getInstance());
        getCount();
    }

    private volatile static VolatileTest instance;

    public static VolatileTest getInstance() {
        if (instance == null) {
            synchronized (VolatileTest.class) {
                if (instance == null) {
                    instance = new VolatileTest();
                }
            }
        }
        return instance;
    }

    private volatile static int count = 0;

    private static void getCount() {
        for (int thread = 0; thread < 10; thread++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    count++;
                }
            }).start();
        }
        if (Thread.activeCount() > 1) {
            Thread.yield();
        }
        System.out.print(count);
    }

}
