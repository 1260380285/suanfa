package com;

/**
 * @author: yuanbing
 * @created time: 2019/7/26 15:22
 * @description:
 */

public class TwoDivide {

    public static void main(String[] args) {
        double l = 1.41;
        double r = 1.42;
        double mid = (r + l) / 2;
        double flag = 0.0000000001;
        System.out.println("flag:" + mid);
        while (r - l > flag) {
            mid = (r + l) / 2;
            if (mid * mid < 2) {
                l = mid;
            } else {
                r = mid;
            }
        }

        System.out.println(mid);
    }
}
