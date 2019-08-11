package com;

/**
 * @author: yuanbing
 * @created time: 2019/8/11 11:12
 * @description:
 */

public class Maxlength {

    public static String getMaxArray1(String str1, String str2) {
        if (str1 == null || str2 == null || str1.equals("") || str2.equals("")) {
            return "";
        }
        //转换称char数组
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        //生成一个M*N大小的二维数组
        int[][] dp = generateDp(array1, array2);
        int end = 0;
        int max = 0;
        //for循环获取二维数组中的最大的值
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (dp[i][j] > max) {
                    end = i;
                    max = dp[i][j];
                }
            }
        }
        return str1.substring(end - max + 1, end + 1);
    }

    public static int[][] generateDp(char[] str1, char[] str2) {
        //初始化一个默认值都是0的二维数组
        int[][] dp = new int[str1.length][str2.length];
        //初始化第一列
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] == str2[0]) {
                dp[i][0] = 1;
            }
        }
        //初始化第一行
        for (int j = 1; j < str2.length; j++) {
            if (str1[0] == str2[j]) {
                dp[0][j] = 1;
            }
        }
        //计算剩余每行每列的数
        for (int i = 1; i < str1.length; i++) {
            for (int j = 1; j < str2.length; j++) {
                if (str1[i] == str2[j]) {
                    //如果相同，就把左上方的值+1赋值给当前的值
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
            }
        }
        return dp;
    }

    public static String getMaxArray2(String str1, String str2) {
        if (str1 == null || str2 == null || str1.equals("") || str2.equals("")) {
            return "";
        }
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        //当前开始的行数
        int row = 0;
        //开始的列数
        int column = array2.length - 1;
        //记录最大长度
        int max = 0;
        //记录最大长度时字串的位置
        int end = 0;
        //循环行数
        while (row < array1.length) {
            int i = row;
            int j = column;
            int len = 0;
            //从（i,j）开始往右下方计算值
            while (i < array1.length && j < array2.length) {
                if (array1[i] != array2[j]) {
                    len = 0;
                } else {
                    len++;
                }
                //记录最大值和结束字符的位置
                if (len > max) {
                    end = i;
                    max = len;
                }
                i++;
                j++;
            }
            //列从大到小移动
            if (column > 0) {
                column--;
            } else {
                //行从小到大移动
                row++;
            }
        }
        return str1.substring(end - max + 1, end + 1);
    }

    public static void main(String[] args) {
        String str1 = "12a34";
        String str2 = "er34cd";
        System.out.println(getMaxArray1(str1, str2));
        System.out.println(getMaxArray2(str1, str2));

    }
}
