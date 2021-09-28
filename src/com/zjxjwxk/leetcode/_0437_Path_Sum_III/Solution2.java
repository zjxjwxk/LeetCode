package com.zjxjwxk.leetcode._0437_Path_Sum_III;

import com.zjxjwxk.leetcode.util.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 前缀和
 * @author Xinkang Wu
 * @date 2021/9/28 16:17
 */
public class Solution2 {

    public int pathSum(TreeNode root, int targetSum) {
        Map<Integer, Integer> preSumCountMap = new HashMap<>();
        preSumCountMap.put(0, 1);
        return dfs(root, 0, preSumCountMap, targetSum);
    }

    private int dfs(TreeNode root, int curSum, Map<Integer, Integer> preSumCountMap, int targetSum) {
        if (root == null) {
            return 0;
        }
        curSum += root.val;
        int ans = preSumCountMap.getOrDefault(curSum - targetSum, 0);
        Integer curSumCount = preSumCountMap.getOrDefault(curSum, 0);
        preSumCountMap.put(curSum, curSumCount + 1);
        ans += dfs(root.left, curSum, preSumCountMap, targetSum);
        ans += dfs(root.right, curSum, preSumCountMap, targetSum);
        preSumCountMap.put(curSum, curSumCount);
        return ans;
    }
}
