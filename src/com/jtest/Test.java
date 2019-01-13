package com.jtest;

/**
 * @author: yuanbing
 * @created time: 2019/1/12 14:52
 * @description:
 */

public class Test {

    public static void main(String[] args) {
        int a=1;
        int b=543;
        int c=43434340;
        double g=calc(a,b);
        System.out.println(g);
    }

    public static double calc(int a,int b){
        int d=2*a;
        double f=Math.sqrt(b);
        return d*f;
    }
}
