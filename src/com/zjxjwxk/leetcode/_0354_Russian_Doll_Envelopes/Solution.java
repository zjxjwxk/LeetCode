package com.zjxjwxk.leetcode._0354_Russian_Doll_Envelopes;

import java.util.Arrays;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/3/4 15:10
 */
public class Solution {

    public int maxEnvelopes(int[][] envelopes) {
        int len = envelopes.length, ans = 1;
        Arrays.sort(envelopes, (envelope1, envelope2) -> {
            if (envelope1[0] != envelope2[0]) {
                return envelope1[0] - envelope2[0];
            } else {
                return envelope2[1] - envelope1[1];
            }
        });
        int[] max = new int[len];
        Arrays.fill(max, 1);
        for (int i = 1; i < len; ++i) {
            for (int j = 0; j <= i - 1; ++j) {
                if (envelopes[i][1] > envelopes[j][1]) {
                    max[i] = Math.max(max[i], max[j] + 1);
                }
            }
            ans = Math.max(ans, max[i]);
        }
        return ans;
    }
}
