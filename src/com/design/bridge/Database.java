package com.design.bridge;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 16:19
 * @description:
 */

abstract class Database {

    protected Convert convert;

    public void setConvert(Convert convert) {
        this.convert = convert;
    }


    abstract void conversion();
}
