package com.annotation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author: yuanbing
 * @created time: 2019/1/22 11:15
 * @description:
 */

class TestEmployee {
    public static void main(String... args) throws Exception {
//        Employee emp1 = new Employee();
//        emp1.setName("Naresh");
//        System.out.println(emp1 + ", hashcode : " + emp1.hashCode());

        Employee emp2 = (Employee) Class.forName("com.annotation.Employee")
                .newInstance();
        emp2.setName("Rishi");
        System.out.println(emp2 + ", hashcode : " + emp2.hashCode());

//        Constructor<Employee> constructor = Employee.class.getConstructor();
//        Employee emp3 = constructor.newInstance();
//        emp3.setName("Yogesh");
//        System.out.println(emp3 + ", hashcode : " + emp3.hashCode());
//
//        Employee emp4 = (Employee) emp3.clone();
//        emp4.setName("Atul");
//        System.out.println(emp4 + ", hashcode : " + emp4.hashCode());
//
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
//        out.writeObject(emp4);
//        out.close();
//        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
//        Employee emp5 = (Employee) in.readObject();
//        in.close();
//        emp5.setName("Akash");
//        System.out.println(emp5 + ", hashcode : " + emp5.hashCode());
    }
}
