package com.test;

/***
 * @author yuanbing
 * @date
 *
 */
public class GuiBingPaixun {
    /***
     * 归并排序是稳定的排序方法。
     * 归并排序的时间复杂度为 O(nlogn)。
     * 速度仅次于快速排序，为稳定排序算法，一般用于对总体无序，但是各子项相对有序的数列
     */
    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8};
        System.out.println("排序之前：");
        for (int anA : a) {
            System.out.print(anA + " ");
        }
        //归并排序
        mergeSort(a, 0, a.length - 1);
        System.out.println();
        System.out.println("排序之后：");
        int i = 0;
        while (i < a.length) {
            System.out.print(a[i] + " ");
            i++;
        }
    }

    private static void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            //对左边进行递归
            mergeSort(a, left, middle);
            //对右边进行递归
            mergeSort(a, middle + 1, right);
            //合并
            merge(a, left, middle, right);
        }
    }

    private static void merge(int[] a, int left, int middle, int right) {
        int[] tmpArr = new int[a.length];
        //右边的起始位置
        int mid = middle + 1;
        int tmp = left;
        int third = left;
        while (left <= middle && mid <= right) {
            //从两个数组中选取较小的数放入中间数组
            if (a[left] <= a[mid]) {
                tmpArr[third++] = a[left++];
            } else {
                tmpArr[third++] = a[mid++];
            }
        }
        //将剩余的部分放入中间数组
        while (left <= middle) {
            tmpArr[third++] = a[left++];
        }
        while (mid <= right) {
            tmpArr[third++] = a[mid++];
        }
        //将中间数组复制回原数组
        while (tmp <= right) {
            a[tmp] = tmpArr[tmp++];
        }
    }
}
