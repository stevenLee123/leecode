/**
 * @author Steven
 * @create 2019/10/30 17:16
 * @Description: 数组问题3 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 */
package com.steven.leecode;

public class Solution3 {

    public static void rotate1(int[] nums, int k) {
        while(k>0){
            int tmp = nums[nums.length-1];
            for(int i = nums.length-1;i >= 1; i--){
                nums[i] = nums[i-1];
            }
            nums[0] = tmp;
            k--;
        }

    }
    public static void rotate2(int[] nums, int k) {

    }
    public static void rotate3(int[] nums, int k) {

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate1(nums,3);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

}
