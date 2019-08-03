package com;

/**
 * @author: yuanbing
 * @created time: 2019/8/3 13:37
 * @description:
 */

public class Bahuanghou2 {
    /**
     * 表示N*N
     */
    static int QUEEN = 6;
    /**
     * 一维数组表示棋盘
     */
    static int[] array = new int[QUEEN];
    /**
     * 数组默认值
     */
    static final int defaultNumber = Integer.MIN_VALUE;
    /**
     * 一共有多少种解法
     */
    static int count = 0;

    /**
     * 初始化默认值
     */
    private static void init() {
        for (int i = 0; i < array.length; i++) {
            array[i] = defaultNumber;
        }
    }

    /**
     * 判断第row行第col列是否可以放置皇后
     *
     * @param row 当前行
     * @param col 当前列
     * @return 是否可以放置
     */
    private static boolean canPlace(int row, int col) {
        //对已经放置皇后的行进行扫描，判断当前点在行，列和斜线上的冲突
        for (int i = 0; i < row; ++i) {
            if (array[i] == col || Math.abs(i - row) == Math.abs(array[i] - col)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 打印输出N皇后的一组解
     */
    private static void print() {
        for (int i = 0; i < QUEEN; ++i) {
            for (int j = 0; j < QUEEN; ++j) {
                //a[i]为初始值
                if (array[i] != j) {
                    System.out.print("X ");
                } else {
                    //a[i]表示在第i行的第a[i]列可以放置皇后
                    System.out.print("Q ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("--------------------------------\n");
    }

    /**
     * 皇后循环主程序
     */
    private static void place() {
        int i = 0, j = 0;
        //对每行进行循环
        while (i < QUEEN) {
            //对i行的每一列进行循环，看是否可以放置皇后
            while (j < QUEEN) {
                //判断该位置是否可以放置皇后
                if (canPlace(i, j)) {
                    //该列可以放置皇后
                    array[i] = j;
                    //此处将j清零，从下一行的第0列开始逐列循环
                    j = 0;
                    break;
                } else {
                    //继续循环下一列
                    ++j;
                }
            }
            //第i行没有找到可以放置皇后的位置
            if (array[i] == defaultNumber) {
                //回溯到第一行，仍然无法找到可以放置皇后的位置，
                if (i == 0) {
                    //说明已经找到所有的解，程序终止
                    break;
                } else {
                    //没有找到可以放置皇后的列，向上一行进行回溯
                    --i;
                    //把上一行皇后的位置往后移一列
                    j = array[i] + 1;
                    //把上一行皇后的位置清除
                    array[i] = defaultNumber;
                    //向上回溯一行后继续判断
                    continue;
                }
            }
            //最后一行找到了一个皇后位置，
            if (i == QUEEN - 1) {
                //说明找到一个结果，打印出来
                System.out.print("第 " + (++count) + " 个解: \n");
                print();
                //要找的是N皇后问题的所有解,所以从最后一行放置皇后列数的下一列继续循环
                j = array[i] + 1;
                //清除最后一行的皇后位置
                array[i] = defaultNumber;
                continue;
            }
            //继续循环下一行的皇后位置
            ++i;
        }
    }

    public static void main(String[] args) {
        init();
        place();
        System.out.print("一共有" + count + "种解");
    }
}
