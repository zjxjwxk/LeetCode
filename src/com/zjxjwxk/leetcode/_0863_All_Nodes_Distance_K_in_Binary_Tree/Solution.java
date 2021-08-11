package com.zjxjwxk.leetcode._0863_All_Nodes_Distance_K_in_Binary_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 深度优先搜索+哈希表
 * @author Xinkang Wu
 * @date 2021/8/11 22:02
 */
public class Solution {

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<Integer, TreeNode> parentMap = new HashMap<>();
        dfs(root, parentMap);
        List<Integer> ans = new ArrayList<>();
        findDistanceK(target, null, k, parentMap, ans);
        return ans;
    }

    private void dfs(TreeNode root, Map<Integer, TreeNode> parentMap) {
        if (root.left != null) {
            parentMap.put(root.left.val, root);
            dfs(root.left, parentMap);
        }
        if (root.right != null) {
            parentMap.put(root.right.val, root);
            dfs(root.right, parentMap);
        }
    }

    private void findDistanceK(TreeNode root, TreeNode pre, int k, Map<Integer, TreeNode> parentMap, List<Integer> ans) {
        if (k == 0) {
            ans.add(root.val);
            return;
        }
        if (root.left != null && root.left != pre) {
            findDistanceK(root.left, root, k - 1, parentMap, ans);
        }
        if (root.right != null && root.right != pre) {
            findDistanceK(root.right, root, k - 1, parentMap, ans);
        }
        TreeNode parent = parentMap.get(root.val);
        if (parent != null && parent != pre) {
            findDistanceK(parent, root, k - 1, parentMap, ans);
        }
    }
}
