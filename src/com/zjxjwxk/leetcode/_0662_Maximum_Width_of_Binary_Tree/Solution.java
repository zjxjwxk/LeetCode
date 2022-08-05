package com.zjxjwxk.leetcode._0662_Maximum_Width_of_Binary_Tree;

import java.util.HashMap;
import java.util.Map;

import com.zjxjwxk.leetcode.util.TreeNode;

public class Solution {
    private int ans;
    private Map<Integer, Integer> levelLeftMap;

    public int widthOfBinaryTree(TreeNode root) {
        ans = 0;
        levelLeftMap = new HashMap<>();
        dfs(root, 0, 0);
        return ans;
    }

    private void dfs(TreeNode root, int level, int pos) {
        if (root == null) {
            return;
        }
        levelLeftMap.putIfAbsent(level, pos);
        Integer left = levelLeftMap.get(level);
        ans = Math.max(ans, pos - left + 1);
        dfs(root.left, level + 1, pos << 1);
        dfs(root.right, level + 1, (pos << 1) + 1);
    }
}