package com.test;

/**
 * @author yuanbing
 */
public class KuaiSuPaixun {
    /***
     * 快速排序是不稳定的排序。
     * 快速排序的时间复杂度为 O(nlogn)。
     * 当n较大时使用快排比较好，当序列基本有序时用快排反而不好。
     */
    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 78, 34, 12};
        System.out.println("排序之前：");
        for (int anA1 : a) {
            System.out.print(anA1 + " ");
        }
        System.out.println();
        //快速排序
        quick(a);
        System.out.println();
        System.out.println("排序之后：");
        for (int anA : a) {
            System.out.print(anA + " ");
        }
    }

    private static void quick(int[] a) {
        if (a.length > 0) {
            quickSort(a, 0, a.length - 1);
        }
    }

    private static void quickSort(int[] a, int low, int high) {
        //如果不加这个判断递归会无法退出导致堆栈溢出异常
        if (low < high) {
            int middle = getMiddle(a, low, high);
            quickSort(a, 0, middle - 1);
            quickSort(a, middle + 1, high);
        }
    }

    private static int getMiddle(int[] a, int low, int high) {
        //基准元素
        int temp = a[low];
        while (low < high) {
            //找到比基准元素小的元素位置
            while (low < high && a[high] >= temp) {
                high--;
            }
            a[low] = a[high];
            while (low < high && a[low] <= temp) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = temp;
        return low;
    }

    private static void print(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
