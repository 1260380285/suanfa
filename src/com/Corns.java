package com;

/**
 * @author: yuanbing
 * @created time: 2019/7/9 22:34
 * @description:
 */

public class Corns {
    public static void main(String[] args) {
        int[] coin = {3, 5, 1};
        System.out.print(coins(coin, 11));
    }

    public static int coins(int[] array, int amount) {
        if (array == null || array.length == 0 || amount < 0) {
            return 0;
        }
        int[][] dp = new int[array.length][amount + 1];
        for (int i = 0; i < array.length; i++) {
            dp[i][0] = 1;
        }
        for (int j = 1; array[0] * j <= amount; j++) {
            dp[0][array[0] * j] = 1;
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j <= amount; j++) {
                dp[i][j] = dp[i - 1][j];
                dp[i][j] += j - array[i] >= 0 ? dp[i][j - array[i]] : 0;
            }
        }
        return dp[array.length - 1][amount];
    }
}
