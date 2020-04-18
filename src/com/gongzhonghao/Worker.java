package com.gongzhonghao;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author: yuanbing
 * @created time: 2020/3/4 20:51
 * @description:
 */

public class Worker implements Serializable {

    private String name;
    private String address;

    public Worker(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Object deepClone() throws CloneNotSupportedException {
       // System.out.println("deepClone调用");
        Worker worker = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            worker = (Worker) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return worker;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
