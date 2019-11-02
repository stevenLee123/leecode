/**
 * @author Steven
 * @create 2019/11/2 16:22
 * @Description: 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 输入: -123
 * 输出: -321
 */
package com.steven.leecode.arrays;

public class Solution13 {

    public static int reverse(int x) {
        int result = 0;
        while(x != 0) {
            int remainder = x%10;
            x = x/10;
            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10  && remainder > 7)){
                return 0;
            }
            if(result <Integer.MIN_VALUE/10 || (result ==Integer.MIN_VALUE/10 && remainder <-8)){
                return 0;
            }
            result = result*10 + remainder;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = -234345349;
        System.out.println(reverse(x));
    }

}
