/**
 * @author Steven
 * @create 2019/10/31 11:06
 * @Description:给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 */
package com.steven.leecode.arrays;

public class Solution4 {
    public static boolean containsDuplicate(int[] nums) {
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,24,12,3,2,4,5};
        System.out.println(containsDuplicate(nums));
    }
}
