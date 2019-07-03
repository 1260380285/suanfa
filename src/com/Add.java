package com;

/**
 * @author: yuanbing
 * @created time: 2019/6/26 18:09
 * @description:
 */

public class Add {
    public static void main(String[] args) {
       int a= multiply(18, 21);
        //  int a = add(14, 19);
        System.out.println(a);
    }

    private static int add(int num1, int num2) {
    /*
    **附加含义：将num1作为返回值；num2用于检查是否产生进位
	*/
        while (num2 != 0) {
            //用于保存异或结果
            System.out.println(Integer.toBinaryString(num1) + ":" + Integer.toBinaryString(num2));
            int res = num1 ^ num2;
            //检查是否产生进位
            num2 = (num1 & num2) << 1;
            num1 = res;

        }
        return num1;

    }


    private static int multiply(int a, int b) {
        // 取绝对值　　
        int multiplicand = a < 0 ? add(~a, 1) : a;
        // 如果为负则取反加一得其补码，即正数　　
        int multiplier = b < 0 ? add(~b, 1) : b;
        // 计算绝对值的乘积　　
        int product = 0;
        int count = 0;
        while (count < multiplier) {
            product = add(product, multiplicand);
            // 这里可别用count++，都说了这里是位运算实现加法　
            count = add(count, 1);
        }
        // 确定乘积的符号　　
        if ((a ^ b) < 0) {
            // 只考虑最高位，如果a,b异号，则异或后最高位为1；如果同号，则异或后最高位为0；　　　　
            product = add(~product, 1);
        }
        return product;
    }
}
