package com.zjxjwxk.leetcode._3100_Water_Bottles_II;

/**
 * 模拟
 *
 * @author Xinkang Wu
 * @date 2025/10/2 22:55
 */
public class Solution {

    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int numDrunk = numBottles;
        while (numBottles >= numExchange) {
            ++numDrunk;
            numBottles -= numExchange - 1;
            ++numExchange;
        }
        return numDrunk;
    }
}
