/**
 * @author Steven
 * @create 2019/11/2 17:25
 * @Description:
 */
package com.steven.leecode.arrays;

public class Solution16 {
    public static boolean isPalindrome(String s){
        // 若字符串为空或者内容为空则直接返回true
        if(s == null || s.length() == 0) return true;
        // 声明两个int类型的变量用来标记第一个字母和最后一个字母
        int start = 0;
        int end = s.length() - 1;
        // 判断字母是否是数字或者字母，如果不是则指向下一个字符，并将大写字母转换为小写字母
        while(start < end) {
            char c = ' ';
            while(start < end) {
                c = s.charAt(start);
                if(c >= 'a' && c <= 'z') {
                    break;
                } else if(c >= '0' && c <= '9') {
                    break;
                } else if(c >= 'A' && c <= 'Z') {
                    c = (char) (c - 'A' + 'a');
                    break;
                } else {
                    start++;
                }
            }

            char b = ' ';
            while(start < end) {
                b = s.charAt(end);
                if(b >= 'a' && b <= 'z') {
                    break;
                } else if(b >= '0' && b <= '9') {
                    break;
                } else if(b >= 'A' && b <= 'Z') {
                    b = (char) (b - 'A' + 'a');
                    break;
                } else {
                    end--;
                }
            }
            // 进行对比
            if(start < end) {
                if(c != b) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
