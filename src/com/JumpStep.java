package com;

/**
 * @author: yuanbing
 * @created time: 2019/9/14 14:48
 * @description:
 */

public class JumpStep {

    public static int jump(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        //跳的步数
        int hasJumpSteps = 0;
        //当前(不包含当前数字)能到达的最远的数组位置
        int maxJumpPosition = 0;
        //到当前数组位置(包含当前数字)，能到达的最远位置
        int jumpFarthest = 0;
        for (int i = 0; i < array.length; i++) {
            //hasJumpSteps不能达到，就需要再跳一步
            if (maxJumpPosition < i) {
                hasJumpSteps++;
                maxJumpPosition = jumpFarthest;
            }
            //获取当前能跳到的最大位置
            jumpFarthest = Math.max(jumpFarthest, i + array[i]);

        }
        return hasJumpSteps;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 1, 2, 1, 4, 1, 2, 6};
        System.out.println(jump(arr));

    }

}
