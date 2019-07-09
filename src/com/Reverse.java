package com;

/**
 * @author: yuanbing
 * @created time: 2019/7/7 14:44
 * @description:
 */

public class Reverse {

    public static void main(String[] args) {
        char[] chars = {'d', 'o', 'g', 's', ' ', 'l', 'o', 'v', 'e', 's', ' ', 'p',
                'i', 'g'};
        rotate(chars);
    }

    private static void rotate(char[] chars) {
        if (chars == null || chars.length == 0) {
            return;
        }
        reverse(chars, 0, chars.length - 1);
        System.out.print(chars);
        int l = -1;
        int r = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                l = i == 0 || chars[i - 1] == ' ' ? i : l;
                r = i == chars.length - 1 || chars[i + 1] == ' ' ? i : r;
            }
            if (l != -1 && r != -1) {
                reverse(chars, l, r);
                l = -1;
                r = -1;
            }
        }
        System.out.print(chars);
    }

    private static void reverse(char[] chars, int start, int end) {
        char temp = 0;
        while (start < end) {
            temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
