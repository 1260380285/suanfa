package com.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: yuanbing
 * @created time: 2019/1/31 15:51
 * @description:
 */

public class Internal {

    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println((str1.intern() == str1));
        //Internal internal=new Internal();
        //String a = new String("计算机") + "软件";
        //internal.test3();
        //internal.test4();
        List<? super Number> consumer=new ArrayList<>();
        consumer.add(2);
        List<? super Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
    }

    //list指向的是同一个字符串
//    private void test1() {
//        String[] list = new String[10000];
//        for (int i = 0; i < 10000; i++) {
//            list[i] = new String(new char[]{'a', 'b', 'c'}).intern();
//        }
//        System.out.println(list.toString());
//    }
//
//    //list中指向的是同一个 map中已有一个字符串
//    private void test2(){
//        String[] list = new String[10000];
//        Map<String, String> pool = new HashMap<>();
//        for (int i = 0; i < 10000; i++) {
//            String s = new String(new char[]{'a','b','c'});
//            pool.putIfAbsent(s, s);
//            list[i] = pool.get(s);
//        }
//        System.out.println(list.toString());
//    }

//    private void test3(){
//        String s = new String("1");
//        s.intern();
//        String s2 = "1";
//        System.out.println(s == s2);
//
//        String s3 = new String("1") + new String("1");
//        s3.intern();
//        String s4 = "11";
//        System.out.println(s3 == s4);
//    }

//    private void test4(){
//        String s = new String("1");
//        String s2 = "1";
//        s.intern();
//        System.out.println(s == s2);
//
//        String s3 = new String("1") + new String("1");
//        String s4 = "11";
//        s3.intern();
//        System.out.println(s3 == s4);
//    }
}
