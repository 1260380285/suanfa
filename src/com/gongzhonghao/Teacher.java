package com.gongzhonghao;

/**
 * @author: yuanbing
 * @created time: 2020/3/4 20:51
 * @description:
 */

public class Teacher implements Cloneable {

    private String name;
    private String address;

    public Teacher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void print() {
        System.out.println("hello");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //System.out.println("clone调用");
        Teacher teacher;
        teacher = (Teacher) super.clone();
        return teacher;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
