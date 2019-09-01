package com;

/**
 * @author: yuanbing
 * @created time: 2019/9/1 12:30
 * @description:
 */

public class PointInRect {

    public static boolean isInRect(double x1, double y1, double x4, double y4,
                                   double x, double y) {
        if (x <= x1) {
            return false;
        }
        if (x >= x4) {
            return false;
        }
        if (y >= y1) {
            return false;
        }
        if (y <= y4) {
            return false;
        }
        return true;
    }

    public static boolean isInRect(double x1, double y1, double x2, double y2,
                                   double x3, double y3, double x4, double y4, double x, double y) {
        if (y1 == y2) {
            return isInRect(x1, y1, x4, y4, x, y);
        }
        double yAxis = Math.abs(y4 - y3);
        double xAxis = Math.abs(x4 - x3);
        double biasLine = Math.sqrt(xAxis * xAxis + yAxis * yAxis);
        double sin = yAxis / biasLine;
        double cos = xAxis / biasLine;
        double x1Convert = cos * x1 + sin * y1;
        double y1Convert = -x1 * sin + y1 * cos;
        double x4Convert = cos * x4 + sin * y4;
        double y4Convert = -x4 * sin + y4 * cos;
        double xConvert = cos * x + sin * y;
        double yConvert = -x * sin + y * cos;
        return isInRect(x1Convert, y1Convert, x4Convert, y4Convert, xConvert, yConvert);
    }

    public static void main(String[] args) {
        // (x1,y1),(x2,y2),(x3,y3),(x4,y4) stand for a Rectangle.
        double x1 = 2;
        double y1 = 2;
        double x2 = 4;
        double y2 = 7;
        double x3 = 6;
        double y3 = 0;
        double x4 = 7;
        double y4 = 4;

        double x = 4;
        double y = 3;
        System.out.print(isInRect(x1, y1, x2, y2, x3, y3, x4, y4, x, y));

    }
}
