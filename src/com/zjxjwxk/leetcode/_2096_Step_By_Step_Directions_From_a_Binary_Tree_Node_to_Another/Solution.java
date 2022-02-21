package com.zjxjwxk.leetcode._2096_Step_By_Step_Directions_From_a_Binary_Tree_Node_to_Another;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * DFS
 * @author Xinkang Wu
 * @date 2022/2/21 20:38
 */
public class Solution {

    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder startPath = new StringBuilder();
        StringBuilder endPath = new StringBuilder();
        dfs(root, startPath, startValue);
        dfs(root, endPath, destValue);
        int i = startPath.length() - 1, j = endPath.length() - 1;
        while (i >= 0 && j >= 0) {
            if (startPath.charAt(i) == endPath.charAt(j)) {
                --i;
                endPath.deleteCharAt(j--);
            } else {
                break;
            }
        }
        StringBuilder ans = new StringBuilder(i + 1 + endPath.length());
        for (int k = 0; k <= i; ++k) {
            ans.append('U');
        }
        return ans.append(endPath.reverse()).toString();
    }

    public boolean dfs(TreeNode root, StringBuilder path, int target) {
        if (root == null) {
            return false;
        }
        if (root.val == target) {
            return true;
        }
        if (dfs(root.left, path, target)) {
            path.append('L');
            return true;
        }
        if (dfs(root.right, path, target)) {
            path.append('R');
            return true;
        }
        return false;
    }
}
