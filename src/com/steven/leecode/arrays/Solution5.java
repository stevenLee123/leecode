/**
 * @author Steven
 * @create 2019/10/31 20:06
 * @Description: 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
package com.steven.leecode.arrays;

public class Solution5 {
    //进行异或运算，相同的数进行异或后都为0，任何数与0异或为其本身
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0;i<nums.length;i++){
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,5,4,3,2};
        System.out.println(singleNumber(nums));
    }
}
