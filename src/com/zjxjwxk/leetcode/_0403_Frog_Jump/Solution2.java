package com.zjxjwxk.leetcode._0403_Frog_Jump;

import java.util.Arrays;

/**
 * 记忆化搜索+二分查找
 * @author Xinkang Wu
 * @date 2021/5/9 14:23
 */
public class Solution2 {

    public boolean canCross(int[] stones) {
        int len = stones.length;
        Boolean[][] dp = new Boolean[len][len];
        return dfs(stones, dp, 0, 0);
    }

    private boolean dfs(int[] stones, Boolean[][] dp, int index, int preStep) {
        if (index == stones.length - 1) {
            return true;
        }
        if (dp[index][preStep] != null) {
            return dp[index][preStep];
        }
        for (int curStep = preStep - 1; curStep <= preStep + 1; ++curStep) {
            int nextIndex = Arrays.binarySearch(stones, index + 1, stones.length, stones[index] + curStep);
            if (nextIndex >= 0 && dfs(stones, dp, nextIndex, curStep)) {
                return dp[index][preStep] = true;
            }
        }
        return dp[index][preStep] = false;
    }
}
