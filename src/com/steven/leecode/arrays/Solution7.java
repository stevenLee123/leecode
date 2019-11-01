/**
 * @author Steven
 * @create 2019/11/1 15:16
 * @Description: 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
package com.steven.leecode.arrays;


public class Solution7 {
    /**
     * 思路：从数组最后一位开始遍历，
     * 判断当前位是否为9，如果是，则将当前位置0，遍历前一位，
     * 如果不为9，在当前位加1，跳出循环
     * 如果遍历到数组的第一位，需要进一位，创建一个数组，长度为入参长度加1，将第一个元素置1，其他位置0
     */
    public static int[] plusOne(int[] digits) {
        boolean addOne = false;
        for (int i = digits.length-1; i >= 0; i--) {
            if(digits[i] != 9){
                digits[i] += 1;
                break;
            }else {
                digits[i] = 0;
                if(i == 0){
                    addOne = true;
                }
            }
        }
        if(addOne){
            int[] result = new int[digits.length+1];
            result[0] = 1;
            return result;
        }else{
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,5,9};
        int[] nums2 = {9,9,9,9,9};
        int[] result = plusOne(nums2);
        for (int a: result) {
            System.out.println(a);
        }
    }
}
