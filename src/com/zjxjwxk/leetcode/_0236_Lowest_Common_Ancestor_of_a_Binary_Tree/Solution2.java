package com.zjxjwxk.leetcode._0236_Lowest_Common_Ancestor_of_a_Binary_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 存储父节点
 * @author Xinkang Wu
 * @date 2022/3/3 20:55
 */
public class Solution2 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        dfs(root, parentMap);
        Set<TreeNode> nodeSet = new HashSet<>();
        TreeNode parent;
        while (p != null) {
            nodeSet.add(p);
            p = parentMap.get(p);
        }
        while (q != null) {
            if (nodeSet.contains(q)) {
                return q;
            }
            q = parentMap.get(q);
        }
        return null;
    }

    private void dfs(TreeNode root, Map<TreeNode, TreeNode> parentMap) {
        if (root.left != null) {
            parentMap.put(root.left, root);
            dfs(root.left, parentMap);
        }
        if (root.right != null) {
            parentMap.put(root.right, root);
            dfs(root.right, parentMap);
        }
    }
}
