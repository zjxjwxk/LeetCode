package com.zjxjwxk.leetcode._0514_Freedom_Trail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2020/11/11 11:01 上午
 */
public class Solution {

    public int findRotateSteps(String ring, String key) {
        int ringLen = ring.length(), keyLen = key.length();
        int[][] dp = new int[keyLen][ringLen];
        List<Integer>[] indexListArr = new List[26];
        for (int i = 0; i < ringLen; ++i) {
            char ch = ring.charAt(i);
            if (indexListArr[ch - 'a'] == null) {
                indexListArr[ch - 'a'] = new ArrayList<>();
            }
            indexListArr[ch - 'a'].add(i);
        }
        for (int i = 0; i < keyLen; ++i) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        for (int index : indexListArr[key.charAt(0) - 'a']) {
            dp[0][index] = Math.min(index, ringLen - index) + 1;
        }
        for (int i = 1; i < keyLen; ++i) {
            for (int preIndex : indexListArr[key.charAt(i - 1) - 'a']) {
                for (int curIndex : indexListArr[key.charAt(i) - 'a']) {
                    int absStep = Math.abs(preIndex - curIndex);
                    dp[i][curIndex] = Math.min(dp[i - 1][preIndex] + Math.min(absStep, ringLen - absStep) + 1, dp[i][curIndex]);
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int index : indexListArr[key.charAt(keyLen - 1) - 'a']) {
            ans = Math.min(dp[keyLen - 1][index], ans);
        }
        return ans;
    }
}
