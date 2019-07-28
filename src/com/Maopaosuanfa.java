package com;

/**
 * @author: yuanbing
 * @created time: 2019/7/28 15:14
 * @description:
 */

public class Maopaosuanfa {

    public static void main(String[] args) {
        int[] a = {7, 6, 4, 5, 8};
        maopao2(a);
    }

    public static void maopao(int[] list) {
        // 用来保存交换的临时记录的数
        int temp;
        // 要遍历的次数
        for (int i = 0; i < list.length - 1; i++) {
            // 从后向前依次比较相邻两个数的大小，遍历一次后，把数组中第i小的数放在第i个位置上
            for (int j = list.length - 1; j > i; j--) {
                // 比较相邻的元素，如果前面的数大于后面的数，则交换
                if (list[j - 1] > list[j]) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
        printAll(list);
    }

    public static void maopao2(int[] list) {
        // 用来保存交换的临时记录的数
        int temp;
        // 是否交换过的标志
        boolean hasChange;
        // 要遍历的次数
        for (int i = 0; i < list.length - 1; i++) {
            hasChange = false;
            // 从后向前依次比较相邻两个数的大小，遍历一次后，把数组中第i小的数放在第i个位置上
            for (int j = list.length - 1; j > i; j--) {
                // 比较相邻的元素，如果前面的数大于后面的数，则交换
                if (list[j - 1] > list[j]) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                    hasChange = true;
                }
            }
            // 如果标志为false，说明本轮遍历没有交换，已经是有序数列，可以结束排序
            if (false == hasChange) {
                break;
            }
        }
        printAll(list);
    }


    private static void printAll(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
