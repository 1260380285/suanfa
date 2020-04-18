package com.gongzhonghao;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: yuanbing
 * @created time: 2020/3/4 21:02
 * @description:
 */

public class Test {

    public static void main(String[] args) {
        MyClassLoader myClassLoader = new MyClassLoader("file:///Users/yuanbing/Desktop/");
        try {
            Class<?> loadClass = myClassLoader.loadClass("com.gongzhonghao.LoaderTest");
            Object o = loadClass.newInstance();
            Method method = loadClass.getMethod("print", null);
            method.invoke(o, null);
        } catch (Exception e) {
            e.printStackTrace();
        }


//        long time = System.currentTimeMillis();
//        List<Teacher> teacherList = null;
//        try {
//            teacherList = new ArrayList<>();
//            for (int i = 0; i < 1000000; i++) {
//                Teacher teacher = new Teacher("allen", "hangzhou");
//                teacherList.add((Teacher) teacher.clone());
//            }
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("使用复制的方式花费的时间耗时：" + (System.currentTimeMillis() - time) + "：" + teacherList.size());
//
//        long time1 = System.currentTimeMillis();
//        List<Worker> workers = new ArrayList<>();
//        try {
//            for (int i = 0; i < 1000000; i++) {
//                Worker worker = new Worker("allen", "hangzhou");
//                workers.add((Worker) worker.deepClone());
//            }
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("使用序列化的方式花费的时间耗时：" + (System.currentTimeMillis() - time1) + "：" + workers.size());

    }
}
