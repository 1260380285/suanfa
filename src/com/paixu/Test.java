package com.paixu;

/**
 * @author: yuanbing
 * @created time: 2019/6/13 15:50
 * @description:https://juejin.im/post/5cff49e75188257a6b40de80#heading-1
 */

public class Test {
    public static void main(String[] args) {
        int[] a = {4, 65, 32, 10, 5, 35, 38, 12};
        maopao(a);
        xuanze(a);
        charu(a);
    }

    /**
     * 冒泡排序无疑是最为出名的排序算法之一，从序列的一端开始往另一端冒泡（你可以从左往右冒泡，也可以从右往左冒泡，看心情），依次比较相邻的两个数的大小（到底是比大还是比小也看你心情
     *
     * @param array
     */
    private static void maopao(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("=================");
    }

    /***
     * 选择排序的思路是这样的：首先，找到数组中最小的元素，拎出来，将它和数组的第一个元素交换位置，第二步，在剩下的元素中继续寻找最小的元素，拎出来，和数组的第二个元素交换位置，
     * 如此循环，直到整个数组排序完成。
     至于选大还是选小，这个都无所谓，你也可以每次选择最大的拎出来排，也可以每次选择最小的拎出来的排，只要你的排序的手段是这种方式，都叫选择排序。
     * @param array
     */
    private static void xuanze(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int a = array[i];
            array[i] = array[min];
            array[min] = a;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("=================");
    }

    /**
     * 插入排序的思想和我们打扑克摸牌的时候一样，从牌堆里一张一张摸起来的牌都是乱序的，我们会把摸起来的牌插入到左手中合适的位置，让左手中的牌时刻保持一个有序的状态。
     *
     * @param array
     */
    private static void charu(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int min = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (min < array[j]) {
                    int a = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = a;
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("=================");
    }
}
