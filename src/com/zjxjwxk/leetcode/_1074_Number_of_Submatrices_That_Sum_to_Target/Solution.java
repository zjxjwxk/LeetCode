package com.zjxjwxk.leetcode._1074_Number_of_Submatrices_That_Sum_to_Target;

import java.util.HashMap;
import java.util.Map;

/**
 * 前缀和+哈希表
 * @author Xinkang Wu
 * @date 2021/5/29 12:14
 */
public class Solution {

    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length, ans = 0;
        for (int i = 0; i < m; ++i) {
            int[] colSum = new int[n];
            for (int j = i; j < m; ++j) {
                Map<Integer, Integer> preColSumCountMap = new HashMap<>();
                preColSumCountMap.put(0, 1);
                int preColSum = 0;
                for (int k = 0; k < n; ++k) {
                    colSum[k] += matrix[j][k];
                    preColSum += colSum[k];
                    Integer targetCount = preColSumCountMap.get(preColSum - target);
                    if (targetCount != null) {
                        ans += targetCount;
                    }
                    preColSumCountMap.merge(preColSum, 1, Integer::sum);
                }
            }
        }
        return ans;
    }
}
