package com;

/**
 * @author: yuanbing
 * @created time: 2019/8/11 14:24
 * @description:
 */

public class HeapPaixu {
    public static void main(String[] args) {
        int[] a = {7, 6, 4, 5, 8, 1};
        heapSort(a);
    }

    /**
     * 调整堆变成大根堆
     *
     * @param array  当前的数组
     * @param parent 父元素
     * @param length 当前需要排序的数组长度，每次第一个元素和最后一个元素交换位置后会减1
     */
    public static void heapAdjust(int[] array, int parent, int length) {
        // temp保存当前父节点
        int temp = array[parent];
        // 先获得左孩子
        int child = 2 * parent + 1;
        while (child < length) {
            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
            if (child + 1 < length && array[child] < array[child + 1]) {
                child++;
            }
            // 如果父结点的值已经大于孩子结点的值，说明已经是大根堆，则直接结束
            if (temp >= array[child]) {
                break;
            }
            // 把孩子结点的值赋给父结点
            array[parent] = array[child];
            // 选取孩子结点的左孩子结点,继续向下筛选进行大小排序
            parent = child;
            child = 2 * child + 1;
        }
        array[parent] = temp;
    }

    public static void heapSort(int[] list) {
        // 第一次循环开始建立初始大根堆
        for (int i = list.length / 2; i >= 0; i--) {
            heapAdjust(list, i, list.length);
        }
        System.out.format("首次调整完成：");
        printPart(list, list.length);
        // 进行n-1次循环，完成排序
        for (int i = list.length - 1; i > 0; i--) {
            // 下面3行是最后一个元素和第一元素进行交换
            int temp = list[i];
            list[i] = list[0];
            list[0] = temp;
            System.out.format("第 %d 趟: \t", list.length - i + 1);
            //交换过位置之后，从堆顶开始比较，调整，使其成为大根堆
            heapAdjust(list, 0, i);
            printPart(list, list.length);
        }
    }

    private static void printPart(int[] list, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
