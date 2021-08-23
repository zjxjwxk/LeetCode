package com.zjxjwxk.leetcode._0987_Vertical_Order_Traversal_of_a_Binary_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

import java.util.*;

/**
 * DFS+哈希表+排序
 * @author Xinkang Wu
 * @date 2021/8/23 22:13
 */
public class Solution {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, Map<Integer, List<Integer>>> colMap = new TreeMap<>();
        dfs(root, 0, 0, colMap);
        List<List<Integer>> ans = new ArrayList<>();
        for (Map.Entry<Integer, Map<Integer, List<Integer>>> colEntry : colMap.entrySet()) {
            List<Integer> colList = new ArrayList<>();
            Map<Integer, List<Integer>> rowMap = colEntry.getValue();
            for (Map.Entry<Integer, List<Integer>> rowEntry : rowMap.entrySet()) {
                List<Integer> nodeList = rowEntry.getValue();
                Collections.sort(nodeList);
                colList.addAll(nodeList);
            }
            ans.add(colList);
        }
        return ans;
    }

    private void dfs(TreeNode root, int row, int col, Map<Integer, Map<Integer, List<Integer>>> colMap) {
        if (root == null) {
            return;
        }
        colMap.putIfAbsent(col, new TreeMap<>());
        Map<Integer, List<Integer>> rowMap = colMap.get(col);
        rowMap.putIfAbsent(row, new ArrayList<>());
        List<Integer> nodeList = rowMap.get(row);
        nodeList.add(root.val);
        dfs(root.left, row + 1, col - 1, colMap);
        dfs(root.right, row + 1, col + 1, colMap);
    }
}
