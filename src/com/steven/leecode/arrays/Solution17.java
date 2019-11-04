/**
 * @program: leecode
 * @description:
 * @author: steven
 * @create: 2019-11-03 10:19
 **/
package com.steven.leecode.arrays;

public class Solution17 {
    public static int myAtoi(String str) {
        if(str.length() == 0){
            return 0;
        }
        int startIndex = 0;
        boolean hasGetStart = false;
        boolean isNagitive = false;
        int endIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if (!hasGetStart) {
                if (tmp == ' ') {
                    continue;
                } else if (tmp == '-' || tmp == '+') {
                    i = i+1;
                    if(i == str.length()){
                        return 0;
                    }
                    isNagitive = (tmp == '-');
                    tmp = str.charAt(i);
                    if (tmp >= '0' && tmp <= '9') {
                        hasGetStart = true;
                        startIndex = i;

                    }else return 0;
                } else if(tmp >= '0' && tmp <= '9') {
                    hasGetStart = true;
                    startIndex = i;
                } else{
                    return 0;
                }
            }
            if (hasGetStart) {
                if(!(tmp >= '0' && tmp <= '9')){
                    endIndex = i;
                    break;
                }else if(i == str.length()-1){
                    endIndex =  i+1;
                }
            }
        }
        if(startIndex == endIndex) return 0;
        if (isNagitive) {
            try{
                return 0 - Integer.valueOf(str.substring(startIndex, endIndex));
            }catch (Exception e){
                return Integer.MIN_VALUE;
            }

        } else {
            try{
                return Integer.valueOf(str.substring(startIndex, endIndex));
            }catch (Exception e){
                return Integer.MAX_VALUE;
            }

        }
    }

    public static void main(String[] args) {
        String s =" ";
        System.out.println(myAtoi(s));
    }
}
