package com;

/**
 * @author: yuanbing
 * @created time: 2019/7/4 22:12
 * @description:
 */

public class PrintCLumn {

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        matrix[0][0] = 1;
        matrix[1][0] = 2;
        matrix[2][0] = 3;
        matrix[3][0] = 4;
        matrix[4][0] = 5;

        matrix[0][1] = 6;
        matrix[1][1] = 7;
        matrix[2][1] = 8;
        matrix[3][1] = 9;
        matrix[4][1] = 10;

        matrix[0][2] = 11;
        matrix[1][2] = 12;
        matrix[2][2] = 13;
        matrix[3][2] = 14;
        matrix[4][2] = 15;

        matrix[0][3] = 16;
        matrix[1][3] = 17;
        matrix[2][3] = 18;
        matrix[3][3] = 19;
        matrix[4][3] = 20;

        matrix[0][4] = 21;
        matrix[1][4] = 22;
        matrix[2][4] = 23;
        matrix[3][4] = 24;
        matrix[4][4] = 25;
        print(matrix);
    }

    private static void print(int[][] matrix) {
        int startR = 0;
        int startC = 0;
        int endR = matrix.length - 1;
        int endC = matrix[0].length - 1;
        while (startR <= endR && startC <= endC) {
            printMatrix(matrix, startR++, startC++, endR--, endC--);
        }
    }

    private static void printMatrix(int[][] matrix, int startR, int startC, int endR, int endC) {
        if (startR == endR) {
            for (int i = startC; i <= endC; i++) {
                System.out.print(matrix[startR][i] + " ");
            }
        } else if (startC == endC) {
            for (int i = startR; i <= endR; i++) {
                System.out.print(matrix[startC][i] + " ");
            }
        } else {
            int currC = startC;
            int currR = startR;
            while (currR != endR) {
                System.out.print(matrix[currR][startC] + " ");
                currR++;
            }
            while (currC != endC) {
                System.out.print(matrix[endR][currC] + " ");
                currC++;
            }

            while (currR != startR) {
                System.out.print(matrix[currR][endC] + " ");
                currR--;
            }

            while (currC != startC) {
                System.out.print(matrix[startR][currC] + " ");
                currC--;
            }

        }
    }
}
