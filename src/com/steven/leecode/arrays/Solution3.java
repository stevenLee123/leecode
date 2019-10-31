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
package com.steven.leecode.arrays;

public class Solution3 {

    // 解决方案1：将最后一个元素存储到临时变量中，一次向后移动每一个元素，移动一位，循环K次
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
    // 解决方案2：如果nums.length%k不为0，从第一个元素将元素放到第k个元素上，再计算第k个元素上，最后会发现这些元素形成了一个闭环，最后一个移动的元素必然会移动到第一个元素上
    //            如果nums.length%k为0，则需要进行循环,失败了
//    public static void rotate2(int[] nums, int k) {
//        //取余操作，防止出现k>nums.length的情况
//        k = k%nums.length;
//        if(k == 0) {
//            return;
//        }
//
//        if(nums.length%k == 0){
//            for(int j = 0;j<k;j++){
//                int tmp = nums[j];
//                int nexttmp;
//                int firstIndex = 0;
//                int count = 1;
//                for(int i = j;i<nums.length;i = i+k*count++){
//                    if(count == 1){
//                        firstIndex = i;
//                        tmp = nums[i];
//                    }
//                    if((i+k)<nums.length){
//                        nexttmp = nums[i+k];
//                        nums[i+k] = tmp;
//                        tmp = nexttmp;
//                    }else{
//                        nexttmp = nums[i];
//                        nums[i] = tmp;
//                        tmp = nexttmp;
//                    }
//                }
//                if(k*count == nums.length){
//                    nums[firstIndex] = tmp;
//                }
//            }
//
//        }
//
//    }
    public static void rotate3(int[] nums, int k) {

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        rotate1(nums,3);
//        rotate2(nums,3);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

}
