package com.design.bridge;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 16:24
 * @description:
 */

class Oracle extends Database{

    @Override
    void conversion() {
        convert.convert();
        System.out.println("Oracle数据库");
    }
}
