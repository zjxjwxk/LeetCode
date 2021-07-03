package com.zjxjwxk.leetcode._1833_Maximum_Ice_Cream_Bars;

/**
 * 计数排序+贪心
 * 时间复杂度:O(n + C)
 * @author Xinkang Wu
 * @date 2021/7/3 17:02
 */
public class Solution2 {

    public int maxIceCream(int[] costs, int coins) {
        int[] counts = new int[100001];
        for (int cost : costs) {
            ++counts[cost];
        }
        int ans = 0;
        for (int i = 1; i <= coins && i <= 100000; ++i) {
            if (counts[i] > 0) {
                int maxCount = Math.min(counts[i], coins / i);
                ans += maxCount;
                coins -= maxCount * i;
            }
        }
        return ans;
    }
}
