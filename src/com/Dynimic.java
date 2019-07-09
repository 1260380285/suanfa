package com;

/**
 * @author: yuanbing
 * @created time: 2019/7/7 16:22
 * @description:
 */

public class Dynimic {
    public static void main(String[] args) {
        int[][] m = new int[4][4];
        m[0][0] = 1;
        m[1][0] = 3;
        m[2][0] = 5;
        m[3][0] = 4;
        m[0][1] = 8;
        m[1][1] = 1;
        m[2][1] = 3;
        m[3][1] = 4;
        m[0][2] = 4;
        m[1][2] = 5;
        m[2][2] = 1;
        m[3][2] = 5;
        m[0][3] = 2;
        m[1][3] = 8;
        m[2][3] = 7;
        m[3][3] = 6;
        System.out.print(getMinDistance(m));
    }

    private static int getMinDistance(int[][] m) {
        if (m == null || m.length == 0) {
            return 0;
        }
        int row = m.length;
        int clo = m[0].length;
        int[][] dp = new int[row][clo];
        dp[0][0] = m[0][0];
        for (int i = 1; i < row; i++) {
            dp[i][0] = dp[i - 1][0] + m[i][0];
        }
        for (int j = 1; j < clo; j++) {
            dp[0][j] = dp[0][j - 1] + m[0][j];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < clo; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + m[i][j];
            }
        }
        return dp[row - 1][clo - 1];
    }
}
