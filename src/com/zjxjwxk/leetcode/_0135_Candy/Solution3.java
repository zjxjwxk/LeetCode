package com.zjxjwxk.leetcode._0135_Candy;

/**
 * 一次遍历+常数空间（易理解版）
 *
 * @author Xinkang Wu
 * @date 2025/10/3 21:57
 */
public class Solution3 {
    public int candy(int[] ratings) {
        int n = ratings.length, increaseCount = 1, decreaseCount = 0, totalCount = 1;
        for (int i = 1; i < n; ++i) {
            if (ratings[i] > ratings[i - 1]) {
                if (decreaseCount > 0) {
                    decreaseCount = 0;
                    increaseCount = 1;
                }
                ++increaseCount;
                totalCount += increaseCount;
            } else if (ratings[i] < ratings[i - 1]) {
                ++decreaseCount;
                if (decreaseCount == increaseCount) {
                    ++decreaseCount;
                }
                totalCount += decreaseCount;
            } else {
                increaseCount = 1;
                decreaseCount = 0;
                totalCount += 1;
            }
        }
        return totalCount;
    }
}
