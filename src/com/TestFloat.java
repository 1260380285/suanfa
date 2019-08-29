package com;

import java.math.BigDecimal;

/**
 * @author: yuanbing
 * @created time: 2019/8/25 20:16
 * @description:
 */

public class TestFloat {
    public static void main(String[] args) {
        System.out.println(3 - 2.6);
        BigDecimal num1 = new BigDecimal(3);
        BigDecimal num2 = new BigDecimal(2.6);
        System.out.print(num1.subtract(num2));
        float s=1;
        s=s+1;
        System.out.print(s);
    }
}
