package com;

/**
 * @author: yuanbing
 * @created time: 2019/10/29 23:07
 * @description:
 */

public class MinNumber {
    public static int missNum(int[] arr) {
        int l = 0;
        int r = arr.length;
        int i = 1;
        while (l < r) {
            System.out.print("第" + (i++) + "次循环:" + "l=" + l + ",r=" + r + ",arr[l]=" + arr[l]+" ");
            if (arr[l] == l + 1) {
                l++;
                System.out.print("因为arr[l]=l+1,所以只需要l++ ");
            } else if (arr[l] <= l || arr[l] > r || arr[arr[l] - 1] == arr[l]) {
                arr[l] = arr[--r];
                System.out.print("当前的arr[l]的值" + arr[l] + ",l的值=" + l + ",当前r=" + r + "，当前arr[arr[l] - 1]=" + arr[arr[l] - 1]+"。");
            } else {
                System.out.print("交换的位置为" + l + "和" + (arr[l] - 1)+"。");
                swap(arr, l, arr[l] - 1);
            }
            print(arr);
        }
        return l + 1;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    private static void print(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 11, 3, 2, 7, 9, 5, 3};
        System.out.println(missNum(arr));

    }
}
