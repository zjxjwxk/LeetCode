package com.zjxjwxk.leetcode._0199_Binary_Tree_Right_Side_View;

import com.zjxjwxk.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DFS
 * @author Xinkang Wu
 * @date 2022/2/26 15:41
 */
public class Solution2 {

    public List<Integer> rightSideView(TreeNode root) {
        Map<Integer, Integer> rightNodeMap = new HashMap<>();
        dfs(root, 1, rightNodeMap);
        List<Integer> ans = new ArrayList<>();
        for (int level = 1; level <= rightNodeMap.size(); ++level) {
            ans.add(rightNodeMap.get(level));
        }
        return ans;
    }

    private void dfs(TreeNode root, int level, Map<Integer, Integer> rightNodeMap) {
        if (root == null) {
            return;
        }
        if (!rightNodeMap.containsKey(level)) {
            rightNodeMap.put(level, root.val);
        }
        dfs(root.right, level + 1, rightNodeMap);
        dfs(root.left, level + 1, rightNodeMap);
    }
}
