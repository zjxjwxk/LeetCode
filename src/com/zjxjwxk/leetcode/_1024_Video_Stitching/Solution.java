package com.zjxjwxk.leetcode._1024_Video_Stitching;

import java.util.Arrays;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2020/10/24 10:41 上午
 */
public class Solution {

    public int videoStitching(int[][] clips, int T) {
        int[] dp = new int[T + 1];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[0] = 0;
        for (int i = 1; i <= T; ++i) {
            for (int[] clip : clips) {
                if (clip[0] <= i - 1 && clip[1] >= i) {
                    if (clip[0] == 0) {
                        dp[i] = 1;
                    } else {
                        dp[i] = Math.min(dp[i], dp[clip[0]] + 1);
                    }
                }
            }
        }
        return dp[T] == Integer.MAX_VALUE - 1 ? -1 : dp[T];
    }
}
