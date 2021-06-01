package com.zjxjwxk.leetcode._1744_Can_You_Eat_Your_Favorite_Candy_on_Your_Favorite_Day;

/**
 * 前缀和
 * @author Xinkang Wu
 * @date 2021/6/1 21:32
 */
public class Solution {

    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int cLen = candiesCount.length, qLen = queries.length;
        boolean[] ans = new boolean[qLen];
        long[] preCountSum = new long[cLen + 1];
        for (int i = 1; i <= cLen; ++i) {
            preCountSum[i] = preCountSum[i - 1] + candiesCount[i - 1];
        }
        for (int i = 0; i < qLen; ++i) {
            ans[i] = queries[i][1] + 1 <= preCountSum[queries[i][0] + 1] && (queries[i][1] + 1L) * queries[i][2] > preCountSum[queries[i][0]];
        }
        return ans;
    }
}
