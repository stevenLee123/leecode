/**
 * @author Steven
 * @create 2019/11/2 17:10
 * @Description:
 */
package com.steven.leecode.arrays;

public class Solution15 {
    public static boolean isAnagram(String s, String t) {
        // 定义一个int类型数组，长度为26即26个字母，用于记录 s中出现的次数 - t中出现的次数
        int []chars = new int[26];

        // 先记录s中每个字母出现次数
        for(char c : s.toCharArray()){
            chars[c-'a']++;
        }
        // 再将t中每个字母出现的次数扣除
        for(char c: t.toCharArray()){
            chars[c-'a']--;
        }
        // 如果这个字母的记录值为0，则s和t中出现的次数一样，反之次数不一样，也就是两个字符串不是有效的字母异位词
        for(int i : chars){
            if( i != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
