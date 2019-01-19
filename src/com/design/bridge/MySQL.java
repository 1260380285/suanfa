package com.design.bridge;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 16:21
 * @description:
 */

class MySQL extends Database{

    @Override
    void conversion() {
        convert.convert();
        System.out.println("MySQL数据库");
    }
}
