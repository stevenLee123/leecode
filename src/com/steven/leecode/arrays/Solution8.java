/**
 * @author Steven
 * @create 2019/11/1 17:01
 * @Description: 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
package com.steven.leecode.arrays;

public class Solution8 {
    // 参考冒泡法来做
    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length-1; i++) {
            if(nums[i] == 0){
                for (int j = i; j < length-1; j++) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
                if(nums[i] == 0){
                    i--;
                }
                length--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
