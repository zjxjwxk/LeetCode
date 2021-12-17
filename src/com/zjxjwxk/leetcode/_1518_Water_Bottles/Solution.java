package com.zjxjwxk.leetcode._1518_Water_Bottles;

/**
 * 模拟
 * @author Xinkang Wu
 * @date 2021/12/17 13:42
 */
public class Solution {

    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0, full = numBottles, empty = 0;
        while (full > 0) {
            ans += full;
            empty += full;
            full = empty / numExchange;
            empty = empty % numExchange;
        }
        return ans;
    }
}
