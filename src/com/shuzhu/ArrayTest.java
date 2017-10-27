package com.shuzhu;

/***
 * @author yuanbing
 * @date
 */
public class ArrayTest {

    public static void main(String[] args) {
        int[] array = {-6, -3, -2, 7, -15, 1, 2, 2};
        int result = findGreatestSumOfSubArray(array);
        System.out.println("连续子元素的最大和为：" + result);
    }

    private static int findGreatestSumOfSubArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        //存储当前连续n项的和
        int currentSum = 0;
        int max = 0;
        //存储连续子元素和的最大值
        for (int anArray : array) {
            ////如过当前连续n项的和小于等于0,则没必要与后面的元素相加
            if (currentSum <= 0) {
                //currentSum重新赋值
                currentSum = anArray;
            } else {
                //如果currentSum的值大于0,则继续与后面的元素相加,
                currentSum += anArray;
            }
            //每次改变currentSum的值都有与max进行比较
            if (currentSum > max) {
                //如果currentSum的值大于max,则将currentSum的值赋值给max
                max = currentSum;
            }
        }
        return max;
    }
}
