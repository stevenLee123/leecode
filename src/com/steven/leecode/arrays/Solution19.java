/**
 * @program: leecode
 * @description: 字符串问题 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * @author: steven
 * @create: 2019-11-05 21:52
 **/
package com.steven.leecode.arrays;

public class Solution19 {
    public static String countAndSay(int n) {
        String result = "1";
        if (n == 1) return result;
        StringBuilder tmpResult = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            int end = 0;
            for (int j = 0; j < result.length(); ) {
                while (end < result.length() && result.charAt(j) == result.charAt(end)) {
                    end++;
                }
                tmpResult.append(end - j).append(result.charAt(j));
                j = end;
            }
            result = tmpResult.toString();
            tmpResult.delete(0, tmpResult.length());
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }
}
