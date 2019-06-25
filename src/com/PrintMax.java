package com;

/**
 * @author: yuanbing
 * @created time: 2019/6/19 15:11
 * @description:
 */

public class PrintMax {
    public static void main(String[] args) {
        PrintMax printMax = new PrintMax();
        printMax.print1ToMaxOfDigit(3);
    }

    public void print1ToMaxOfDigit(int n) {
        if (n <= 0) {
            return;
        }
        char[] number = new char[n];
        print1ToMax(number, 0);
    }

    private void print1ToMax(char[] number, int index) {
        if (index == number.length) {
            printNumber(number);
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[index] = (char) (i + '0');
            print1ToMax(number, index + 1);
        }
    }

    private void printNumber(char[] number) {
        int index = 0;
        //排除char数组中的前面的0
        while (index < number.length && number[index] == '0') {
            index++;
        }
        while (index < number.length) {
            System.out.print(number[index++]);
        }
        System.out.println();
    }
}
