package com.zjxjwxk.leetcode._0108_Convert_Sorted_Array_to_Binary_Search_Tree;

import com.zjxjwxk.leetcode.util.TreeNode;

/**
 * 分治
 *
 * @author Xinkang Wu
 * @date 2025/7/17 19:42
 */
public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + ((right - left) >> 1);
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, left, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, right);
        return root;
    }
}
