/**
 * @program: leecode
 * @description: 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 * @author: steven
 * @create: 2019-11-04 21:29
 **/
package com.steven.leecode.arrays;

public class Solution18 {
    public static int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        if(haystack.length()<needle.length()){
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)){
                int tmp = i;
                if(needle.length() == 1){
                    return 0;
                }
                for (int j = 1; j < needle.length(); j++) {
                    if(i == haystack.length()-1) return -1;
                    if(haystack.charAt(++i) == needle.charAt(j)){
                        if(j == needle.length()-1){
                            return tmp;
                        }
                    }else{
                        i = tmp;
                        break;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "hello";
        System.out.println(strStr(haystack,needle));
    }
}
