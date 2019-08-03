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
     * 检验第i行的k列上是否可以摆放皇后
     *
     * @param i
     * @param k
     * @return
     */
    private static boolean find(int i, int k) {
        int j = 1;
        //j=1~i-1是已经放置了皇后的行
        while (j < i) {
            //第j行的皇后是否在k列或(j,map[j])与(i,k)是否在斜线上
            if (map[j] == k || Math.abs(j - i) == Math.abs(map[j] - k)) {
                return false;
            }
            j++;
        }
        return true;
    }

    /**
     * 放置皇后到棋盘上
     *
     * @param k
     * @param n
     */
    private static void place(int k, int n) {
        int j;
        //递归出口
        if (k > n) {
            print(n);
        } else {
            //试探第k行的每一个列
            for (j = 1; j <= n; j++) {
                if (find(k, j)) {
                    //保存位置
                    map[k] = j;
                    //接着下一行
                    place(k + 1, n);
                }
            }
        }
    }

    public static void main(String[] args) {
        int N=10;
        map = new int[16];
        place(1, 15);
        System.out.print("总共解个数：" + count);
    }
}
