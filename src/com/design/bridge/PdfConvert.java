package com.design.bridge;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 16:25
 * @description:
 */

class PdfConvert implements Convert{
    @Override
    public void convert() {
        System.out.println("转换为pdf格式，数据库为：");
    }
}
