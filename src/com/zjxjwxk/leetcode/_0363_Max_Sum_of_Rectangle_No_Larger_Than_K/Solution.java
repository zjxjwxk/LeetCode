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
            int[] colSum = new int[n];
            for (int j = i; j < m; ++j) {
                int preColSum = 0;
                TreeSet<Integer> treeSet = new TreeSet<>();
                treeSet.add(0);
                for (int c = 0; c < n; ++c) {
                    colSum[c] += matrix[j][c];
                    preColSum += colSum[c];
                    Integer ceiling = treeSet.ceiling(preColSum - k);
                    if (ceiling != null) {
                        ans = Math.max(ans, preColSum - ceiling);
                    }
                    treeSet.add(preColSum);
                }
            }
        }
        return ans;
    }
}
