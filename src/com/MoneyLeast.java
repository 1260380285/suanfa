package com;

/**
 * @author: yuanbing
 * @created time: 2019/7/7 13:11
 * @description:
 */

public class MoneyLeast {

    public static void main(String[] args) {
        int[] coins = new int[]{1, 4, 7, 5};
        System.out.print(coinChange(coins, 24));
        System.out.print(coinChange(coins, 24));
        System.out.print(changeCoin(coins, 24));
    }

    public static int coinChange(int[] coins, int amount) {//硬币数组，找零面额
        if (amount == 0) {
            return 0;
        }

        int len = coins.length;
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; ++i) {
            int h = amount;
            for (int j = 0; j < len; ++j) {
                if (coins[j] <= i && dp[i - coins[j]] != -1) {
                    if (dp[i - coins[j]] <= h) {
                        h = dp[i - coins[j]];
                    }
                }
            }
            if (h < i + 1) {
                dp[i] = h + 1;
            } else {
                dp[i] = -1;
            }
        }
        return dp[amount];
    }


    private static int changeCoin(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount < 0) {
            return -1;
        }
        int n = coins.length;
        int max = Integer.MAX_VALUE;
        //初始化dp数组
        int[][] dp = new int[n][amount + 1];
        //初始化第一行的数组，如第一个图
        for (int j = 1; j <= amount; j++) {
            dp[0][j] = max;
            if (j - coins[0] >= 0 && dp[0][j - coins[0]] <= max) {
                dp[0][j] = dp[0][j - coins[0]] + 1;
            }
        }
        int left;
        //通过和(i-1)一行比较，循环获取硬币数量，
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= amount; j++) {
                left = max;
                if (j - coins[i] >= 0 && dp[i][j - coins[i]] <= max) {
                    left = dp[i][j - coins[i]] + 1;
                }
                dp[i][j] = Math.min(left, dp[i - 1][j]);
            }
        }
        return dp[n - 1][amount] != max ? dp[n - 1][amount] : -1;

    }

    //{1, 4, 7, 5};
    public static int change(int[] coins, int amount) {
        int dp[] = new int[amount];
        dp[0] = 1;
        //将每种面额都计算一遍
        for (int i = 0; i < coins.length; i++) {
            //这里从coins[i]开始，表示这种面额只能用于总金额比它大的情况下
            for (int j = coins[i]; j <= amount; j++) {
                //计算当使用当前的面额，不同总金额的数量都需要改变
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount];
    }
}
