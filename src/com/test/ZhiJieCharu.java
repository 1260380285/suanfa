package com.test;

import java.util.Arrays;

/**
 * @author yuanbing
 */
public class ZhiJieCharu {
    /***
     * 直接插入排序是稳定的排序
     * 文件初态不同时，直接插入排序所耗费的时间有很大差异。
     * 若文件初态为正序，则每个待插入的记录只需要比较一次就能够找到合适的位置插入，
     * 故算法的时间复杂度为 O(n)，这时最好的情况。若初态为反序，则第i个待插入记录需要比较 i+1
     * 次才能找到合适位置插入，故时间复杂度为 O(n2)，这时最坏的情况。
     * 直接插入排序的平均时间复杂度为 O(n2)。
     */
    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27};
        System.out.println("排序之前：");
        for (int anA : a) {
            System.out.print(anA + " ");
        }
        //直接插入排序
        for (int i = 1; i < a.length; i++) {
            //待插入元素
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                //将大于temp的往后移动一位
                if (a[j] > temp) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = temp;
        }
        System.out.println();
        System.out.println("排序之后：");
        System.out.print(Arrays.toString(a));
    }
}
