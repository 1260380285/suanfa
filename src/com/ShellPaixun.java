package com;

/**
 * @author: yuanbing
 * @created time: 2019/8/3 18:10
 * @description:
 */

public class ShellPaixun {
    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 78, 34, 12, 31};
        shellSort(a);
        // print(a);
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
    }

    public static void shellSort(int[] arrays) {
        //increment增量每次都/2
        for (int step = arrays.length / 2; step > 0; step /= 2) {
            System.out.println("step==============" + step);
            //从增量那组开始进行插入排序，直至完毕
            for (int i = step; i < arrays.length; i++) {
                int j = i;
                int temp = arrays[j];

                // j - step 就是代表与它同组隔壁的元素
                while (j - step >= 0 && arrays[j - step] > temp) {
                    arrays[j] = arrays[j - step];
                    j = j - step;
                }
                arrays[j] = temp;
                print(arrays);
                System.out.println();
            }
        }
    }
}