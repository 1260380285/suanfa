package com.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * @author: yuanbing
 * @created time: 2018/2/26 11:02
 * @description:
 */

public class ThreadPoolTest {
    public static void main(String[] args) {
        cachedThreadPoolDemo();
        //fixedThreadPoolDemo();
        //scheduledThreadPoolDemo();
    }

    public static void cachedThreadPoolDemo() {
        ExecutorService cachedThreadPool = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            //System.out.println("index " + i + "start");
            final int index = i;
            cachedThreadPool.execute(() -> {
                System.out.println("index " + index + "start");
                int a = 0;
                int b = 4;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int c = a + b;
                System.out.println("index " + index + "end");
            });
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }

    public static void fixedThreadPoolDemo() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 6; i++) {
            final int index = i;
            fixedThreadPool.execute(() -> System.out.println(Thread.currentThread().getName() + ", index=" + index));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void scheduledThreadPoolDemo() {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);
        //定时执行一次的任务，延迟1s后执行
        scheduledThreadPool.schedule(() ->
                        System.out.println(Thread.currentThread().getName() + ", delay 1s"),
                1, TimeUnit.SECONDS);

        //周期性地执行任务，延迟2s后，每3s一次地周期性执行任务
        scheduledThreadPool.scheduleAtFixedRate(() ->
                        System.out.println(Thread.currentThread().getName() + ", every 3s"),
                2, 3, TimeUnit.SECONDS);
    }
}
