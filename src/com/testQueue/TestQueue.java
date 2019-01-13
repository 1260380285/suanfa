package com.testQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

import sun.rmi.runtime.Log;

/**
 * @author: yuanbing
 * @created time: 2018/3/9 13:06
 * @description:
 */

public class TestQueue {
    public static void main(String[] args) {
        add2Queue("11");
        add2Queue("10");
        add2Queue("12");
        add2Queue("11");
        add2Queue("12");
        add2Queue("12");
        add2Queue("12");
        add2Queue("12");
        add2Queue("12");
        add2Queue("12");
        add2Queue("12");
        add2Queue("13");
        add2Queue("12");
        add2Queue("12");
        add2Queue("13");


    }

    static final Queue<Double> queue = new ArrayDeque(10);

    private static void add2Queue(String value) {
        /*if (TextUtils.isEmpty(value)) {
            return;
        }*/
        if (queue.size() >= 10) {
            queue.poll();
        }
        queue.add(Double.parseDouble(value));
        if (queue.size() >= 10) {
            double max = Collections.min(queue);
            System.out.println(max);
        }
        //System.out.println(queue.size());
    }
}
