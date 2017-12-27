package com.testChild;

import java.util.List;

/**
 * @author: yuanbing
 * @created time: 2017/11/15 下午5:18
 * @description:
 */

public class Child extends Father {
    private String address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }

    public static <T extends Comparable<? super T>> T compare(List<? extends T> list) {
        return null;
    }
}
