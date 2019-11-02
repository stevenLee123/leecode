/**
 * @author Steven
 * @create 2019/11/2 16:39
 * @Description: 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 */
package com.steven.leecode.arrays;

public class Solution14 {
    public static int firstUniqChar(String s) {
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            flag = true;
            for (int j = 0; j < s.length(); j++) {
                if((s.charAt(i) == s.charAt(j)) && (i != j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "a";
        System.out.println(firstUniqChar(s));
    }
}
