package com.testEnum;

/**
 * @author: yuanbing
 * @created time: 2017/11/18 下午4:08
 * @description:
 */

public enum Colors {
    GREEN("绿色", 1), RED("红色", 2), BLACK("黑色", 3);

    private String mName;
    private int mIndex;

    Colors(String name, int index) {
        this.mName = name;
        this.mIndex = index;
    }

    public static String getName(int index) {
        for (Colors c : Colors.values()) {
            if (c.getIndex() == index) {
                return c.getName();
            }
        }
        return null;
    }

    private String getName() {
        return this.mName;
    }

    private int getIndex() {
        return this.mIndex;
    }
}
