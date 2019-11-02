/**
 * @author Steven
 * @create 2019/11/2 15:41
 * @Description:
 */
package com.steven.leecode.arrays;

public class Solution12 {
    public static void reverseString(char[] s) {
        int len = s.length;
        char tmp = 0;
        for (int i = len / 2 - 1; i >= 0; i--) {
            tmp = s[i];
            s[i] = s[len - i - 1];
            s[len - i - 1] = tmp;
        }
    }

    public static void main(String[] args) {
        char[] s = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        reverseString(s);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
