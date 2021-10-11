package com.zjxjwxk.leetcode._0441_Arranging_Coins;

/**
 * 数学
 * @author Xinkang Wu
 * @date 2021/10/11 15:44
 */
public class Solution {

    public int arrangeCoins(int n) {
        return (int) ((Math.sqrt((long) n * 8 + 1) - 1) / 2);
    }
}
