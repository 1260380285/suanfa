package com.fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yuanbing
 * @created time: 2018/4/26 19:30
 * @description:
 */

public class TestArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("3");
        String name = getName("yuanbing");
        System.out.println(name);
    }

    public static <T> T getName(T t) {
        return t;
    }

    public static void getPassword(){
        //List<double> list = new ArrayList<>();
        List<Double> list = new ArrayList<>();
        list.add(4.3);
       // Pair<String>[] table = new Pair<String>(10); //ERROR
    }

    //public class Problem<T> extends Exception{......}不行
}
