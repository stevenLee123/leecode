/**
 * @author Steven
 * @create 2019/10/31 20:16
 * @Description:
 */
package com.steven.leecode.arrays;

import java.util.Arrays;

public class Solution6 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int nums2Length = nums2.length;
        int[] result = new int[nums2Length];
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2Length; j++) {
                if(nums1[i] == nums2[j]){
                    result[count++] = nums2[j];
                    removeCurrentElement(nums2,j);
                    nums2Length--;
                    break;
                }
            }
        }

        return Arrays.copyOfRange(result,0,count);
    }
    //移除重复元素
    public static void removeCurrentElement(int[] nums, int i){
        for(int j = i;j <nums.length-1; j++){
            nums[j] = nums[j+1];
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,21,2};
        int[] nums2 = {2,2,3,3,1};
        int[] result = intersect(nums1,nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
