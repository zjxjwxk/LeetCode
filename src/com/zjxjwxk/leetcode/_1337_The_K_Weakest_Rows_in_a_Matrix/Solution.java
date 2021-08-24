package com.zjxjwxk.leetcode._1337_The_K_Weakest_Rows_in_a_Matrix;

import java.util.Arrays;

/**
 * 统计+排序
 * 时间复杂度：O(mn+mlogm)
 * @author Xinkang Wu
 * @date 2021/8/24 11:16
 */
public class Solution {

    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int[][] counts = new int[m][2];
        for (int i = 0; i < m; ++i) {
            counts[i][1] = i;
            int count = 0;
            while (count < n && mat[i][count] == 1) {
                ++count;
            }
            counts[i][0] = count;
        }
        Arrays.sort(counts, (count1, count2) -> {
            if (count1[0] != count2[0]) {
                return count1[0] - count2[0];
            } else {
                return count1[1] - count2[1];
            }
        });
        int[] ans = new int[k];
        for (int i = 0; i < k; ++i) {
            ans[i] = counts[i][1];
        }
        return ans;
    }
}
