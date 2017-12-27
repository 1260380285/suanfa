package com.testEnum;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author: yuanbing
 * @created time: 2017/11/18 下午4:09
 * @description:
 */

public class TestEnum {
    public static void main(String[] args) {
        // testColor(Color.BLACK);
        //System.out.print(Colors.getName(2));
        PayDay payDay = PayDay.MONDAY;
        double pay = payDay.pay(9, 0.4);
        System.out.println(pay);
        //test(ExtendOperation.class, 4, 5);
        test(Arrays.asList(ExtendOperation.values()), 4, 5);
    }

    public static void testColor(Color color) {
        switch (color) {
            case RED:
                System.out.print("red");
                break;
            case BLACK:
                System.out.print("black");
                break;
            case GREEN:
                System.out.print("green");
                break;
            default:
                System.out.print("default");
                break;
        }
    }

    private static <T extends Enum<T> & Operation> void test(Class<T> cSet, double x, double y) {
        for (Operation c : cSet.getEnumConstants()) {
            System.out.println(c.apply(x, y));
        }
    }

    private static void test(Collection<? extends Operation> cSet, double x, double y) {
        for (Operation c : cSet) {
            System.out.println(c.apply(x, y));
        }
    }

    private static <T extends Operation> void tests(Collection<T> cSet, double x, double y) {
        for (Operation c : cSet) {
            System.out.println(c.apply(x, y));
        }
    }
}
