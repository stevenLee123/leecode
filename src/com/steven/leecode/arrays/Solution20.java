/**
 * @program: leecode
 * @description: 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * @author: steven
 * @create: 2019-11-06 21:57
 **/
package com.steven.leecode.arrays;

public class Solution20 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length ==1){
            return strs[0];
        }
        StringBuilder result = new StringBuilder();
        int index = 0;
        int i = 1;
        while(i< strs.length){
            if(index >= strs[0].length() || index >= strs[i].length()) break;
            if(strs[0].charAt(index) == strs[i].charAt(index)){
                i++;
            }else {
                break;
            }
            if(i == strs.length){
                result.append(strs[0].charAt(index));
                index++;
                i  = 1;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
