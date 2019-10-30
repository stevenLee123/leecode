/**
 * @author Steven
 * @create 2019/10/30 9:41
 * @Description:
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 输入: [1,2,3,4,5]
 * 输出: 4
 * 解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 *      注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。
 *      因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
 * 解题思路：利用折线图的思想，只需要找到所有波谷到波峰的差值之和。
 *
 */
package com.steven.leecode;

public class Solution2 {
    public static int maxProfit(int[] prices) {
        //贪心法
        if(prices==null || prices.length==0)
            return 0;
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1])
                //累加后一天和前一天的差（后一天大于前一天的情况下）
                profit+=(prices[i]-prices[i-1]);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,4,4,5,62,32};
        System.out.println(maxProfit(prices));
    }
}
