package com.zjxjwxk.leetcode._3117_Minimum_Sum_of_Values_by_Dividing_Array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zjxjwxk
 */
public class Solution {

    private static final int INF = (1 << 20) - 1;
    private Map<Integer, Integer>[] memo;

    public int minimumValueSum(int[] nums, int[] andValues) {
        int n = nums.length, m = andValues.length;
        memo = new HashMap[m * n];
        for (int i = 0; i < m * n; ++i) {
            memo[i] = new HashMap<>();
        }
        int res = dfs(0, 0, INF, nums, andValues);
        return res < INF ? res : -1;
    }

    private int dfs(int i, int j, int cur, int[] nums, int[] andValues) {
        int m = andValues.length, key = i * m + j;
        if (i == nums.length && j == andValues.length) {
            return 0;
        }
        if (i == nums.length || j == andValues.length) {
            return INF;
        }
        if (memo[key].containsKey(cur)) {
            return memo[key].get(cur);
        }
        cur &= nums[i];
        if ((cur & andValues[j]) < andValues[j]) {
            return INF;
        }
        int res = dfs(i + 1, j, cur, nums, andValues);
        if (cur == andValues[j]) {
            res = Math.min(res, dfs(i + 1, j + 1, INF, nums, andValues) + nums[i]);
        }
        memo[key].put(cur, res);
        return res;
    }
}
