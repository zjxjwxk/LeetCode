package com.zjxjwxk.leetcode._0260_Single_Number_III;

/**
 * 位运算
 * @author Xinkang Wu
 * @date 2021/11/2 13:01
 */
public class Solution {

    public int[] singleNumber(int[] nums) {
        int xorSum = 0;
        for (int num : nums) {
            xorSum ^= num;
        }
        int lowestBit = xorSum == Integer.MIN_VALUE ? xorSum : xorSum & (-xorSum);
        int type1 = 0, type2 = 0;
        for (int num : nums) {
            if ((num & lowestBit) != 0) {
                type1 ^= num;
            } else {
                type2 ^= num;
            }
        }
        return new int[]{type1, type2};
    }
}
