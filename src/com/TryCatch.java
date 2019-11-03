package com;

/**
 * @author: yuanbing
 * @created time: 2019/10/14 14:52
 * @description:
 */

public class TryCatch {

    public static void main(String[] args) {
        int x = generate();
        System.out.print(x);
    }

    private static int generate() {
        int x;
        try {
            x = 1000;
            return x;
        } catch (Exception e) {
            x = 2000;
        } finally {
            x = 3000;
            System.out.print("1111---");
           // return x;
        }
        return x;
    }
}
