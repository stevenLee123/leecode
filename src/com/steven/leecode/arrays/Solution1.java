/**
 * @program: leecode
 * @description: 数组问题1给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * @author: steven
 * @create: 2019-10-29 23:37
 **/
package com.steven.leecode.arrays;

public class Solution1 {
    public static int removeDuplicates(int[] nums) {
        int resultLength = nums.length;

        for(int i = 0; i < resultLength;i++){
            for(int j = i+1;j<resultLength;){
                //比较相邻两个元素大小，如果大小相等，移除后一个元素，将标志不重复数组长度的值减一
                if(nums[i] == nums[j]){
                    removeCurrentElement(nums,j,resultLength);
                    resultLength--;
                }else {
                    break;
                }
            }

        }
        return resultLength;
    }
    //移除重复元素
    public static void removeCurrentElement(int[] nums, int i,int resultLength){
        for(int j = i;j < resultLength-1; j++){
            nums[j] = nums[j+1];
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4,4,4,4,4};
        int length = removeDuplicates(nums);
        System.out.println("length:" + length);
        for(int i = 0;i<length;i++){
            System.out.println("i:" + nums[i]);
        }
    }
}
