package com.design.bridge;

/**
 * @author: yuanbing
 * @created time: 2019/1/18 16:27
 * @description:桥接模式  多对多
 */

class Test {
    public static void main(String[] args) {
        Database database = new MySQL();
        Convert convert = new PdfConvert();
        database.setConvert(convert);
        database.conversion();
    }
}
