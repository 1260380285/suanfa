package com;

/**
 * @author: yuanbing
 * @created time: 2019/8/3 12:31
 * @description:
 */


public class Bahuanghou {

    static int[] map;
    /**
     * 统计解的个数
     */
    static int count = 0;

    /**
     * 输出一个解
     *
     * @param n
     */
    private static void print(int n) {
        int i, j;
        count++;
        System.out.print("第" + count + "个解：" + count);
        for (i = 1; i <= n; i++) {
            System.out.print("第i行： " + i + ":第q[i]列" + map[i]);
        }
        System.out.print("\n");
        //行
        for (i = 1; i <= n; i++) {
            //列
            for (j = 1; j <= n; j++) {
                if (map[i] != j) {
                    System.out.print("x ");
                } else {
                    System.out.print("Q ");
                }
            }
            System.out.print("\n");
        }
    }

    /**
     * 检验第row行的column列上是否可以摆放皇后
     *
     * @param row    第i行
     * @param column 第k列
     * @return 是否合格
     */
    private static boolean canPlace(int row, int column) {
        int currentRow = 1;
        //对已经放置了皇后的行进行判断
        while (currentRow < row) {
            //第j行的皇后是否在k列或(j,map[j])与(i,k)是否在斜线上
            if (map[currentRow] == column || Math.abs(currentRow - row) == Math.abs(map[currentRow] - column)) {
                return false;
            }
            currentRow++;
        }
        return true;
    }

    /**
     * 放置皇后到棋盘上
     *
     * @param row 当前行
     * @param max 最后一行
     */
    private static void place(int row, int max) {
        int column;
        //递归出口
        if (row > max) {
            print(max);
        } else {
            //某一行从左到右循环
            for (column = 1; column <= max; column++) {
                if (canPlace(row, column)) {
                    //保存位置
                    map[row] = column;
                    //接着下一行
                    place(row + 1, max);
                }
            }
        }
    }

    public static void main(String[] args) {
        int N = 5;
        map = new int[N + 1];
        place(1, N);
        System.out.print("总共解个数：" + count);
    }
}
