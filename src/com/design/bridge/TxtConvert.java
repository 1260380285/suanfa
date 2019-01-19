package com.design.bridge;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 16:26
 * @description:
 */

class TxtConvert implements Convert{

    @Override
    public void convert() {
        System.out.println("转换为txt格式，数据库为：");
    }
}
