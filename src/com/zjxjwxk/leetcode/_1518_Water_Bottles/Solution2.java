package com.zjxjwxk.leetcode._1518_Water_Bottles;

/**
 * 数学
 * @author Xinkang Wu
 * @date 2021/12/17 13:42
 */
public class Solution2 {

    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles + (numBottles >= numExchange ? (numBottles - numExchange) / (numExchange - 1) + 1 : 0);
    }
}
