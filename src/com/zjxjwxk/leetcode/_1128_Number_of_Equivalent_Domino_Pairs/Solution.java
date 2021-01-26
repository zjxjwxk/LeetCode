package com.zjxjwxk.leetcode._1128_Number_of_Equivalent_Domino_Pairs;

/**
 * 哈希表
 * @author Xinkang Wu
 * @date 2021/1/26 11:07
 */
public class Solution {

    public int numEquivDominoPairs(int[][] dominoes) {
        int[] counts = new int[100];
        int ans = 0;
        for (int[] dominoe : dominoes) {
            int val = dominoe[0] <= dominoe[1] ? dominoe[0] * 10 + dominoe[1] : dominoe[1] * 10 + dominoe[0];
            ans += counts[val];
            ++counts[val];
        }
        return ans;
    }
}
