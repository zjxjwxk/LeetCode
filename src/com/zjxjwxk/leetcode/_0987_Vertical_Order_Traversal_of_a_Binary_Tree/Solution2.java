package com.zjxjwxk.leetcode._0987_Vertical_Order_Traversal_of_a_Binary_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义排序
 * @author Xinkang Wu
 * @date 2021/8/24 00:32
 */
public class Solution2 {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<int[]> nodeList = new ArrayList<>();
        dfs(root, 0, 0, nodeList);
        nodeList.sort((node1, node2) -> {
            if (node1[1] != node2[1]) {
                return node1[1] - node2[1];
            } else if (node1[0] != node2[0]) {
                return node1[0] - node2[0];
            } else {
                return node1[2] - node2[2];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nodeList.size(); ++i) {
            int[] node = nodeList.get(i);
            List<Integer> colList;
            if (i == 0 || node[1] != nodeList.get(i - 1)[1]) {
                colList = new ArrayList<>();
                ans.add(colList);
            } else {
                colList = ans.get(ans.size() - 1);
            }
            colList.add(node[2]);
        }
        return ans;
    }

    private void dfs(TreeNode root, int row, int col, List<int[]> nodeList) {
        if (root == null) {
            return;
        }
        nodeList.add(new int[]{row, col, root.val});
        dfs(root.left, row + 1, col - 1, nodeList);
        dfs(root.right, row + 1, col + 1, nodeList);
    }
}
