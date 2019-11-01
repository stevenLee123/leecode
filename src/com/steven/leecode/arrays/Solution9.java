/**
 * @author Steven
 * @create 2019/11/1 17:25
 * @Description:给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
package com.steven.leecode.arrays;

public class Solution9 {
    // 使用减法来计算，避免全部遍历
    public static int[] twoSum(int[] nums, int target) {
        int tmp = 0;
        int[] indexArr = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            tmp = target-nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if(tmp == nums[j]){
                    indexArr[0] = i;
                    indexArr[1] = j;
                    break;
                }
            }
        }
        return indexArr;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] result = twoSum(nums,target);
        System.out.println(result[0]+" "+result[1]);
    }
}
