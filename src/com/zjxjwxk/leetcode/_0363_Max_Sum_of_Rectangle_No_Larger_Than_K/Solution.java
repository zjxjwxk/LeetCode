package com.zjxjwxk.leetcode._0363_Max_Sum_of_Rectangle_No_Larger_Than_K;

import java.util.TreeSet;

/**
 * 有序集合
 * @author Xinkang Wu
 * @date 2021/4/25 23:23
 */
public class Solution {

    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length, ans = Integer.MIN_VALUE;
        for (int i = 0; i < m; ++i) {
            int[] sums = new int[n];
            for (int j = i; j < m; ++j) {
                for (int c = 0; c < n; ++c) {
                    sums[c] += matrix[j][c];
                }
                TreeSet<Integer> preSumSet = new TreeSet<>();
                int preSumRight = 0;
                preSumSet.add(0);
                for (int sum : sums) {
                    preSumRight += sum;
                    Integer preSumLeft = preSumSet.ceiling(preSumRight - k);
                    if (preSumLeft != null) {
                        ans = Math.max(ans, preSumRight - preSumLeft);
                    }
                    preSumSet.add(preSumRight);
                }
            }
        }
        return ans;
    }
}
