package com.zjxjwxk.leetcode._1833_Maximum_Ice_Cream_Bars;

import java.util.Arrays;

/**
 * 排序+贪心
 * 时间复杂度:O(nlogn)
 * @author Xinkang Wu
 * @date 2021/7/3 16:51
 */
public class Solution {

    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans = 0, index = 0;
        while (index < costs.length && coins >= costs[index]) {
            coins -= costs[index++];
            ++ans;
        }
        return ans;
    }
}
