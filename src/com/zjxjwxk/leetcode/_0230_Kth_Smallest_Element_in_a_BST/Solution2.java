package com.zjxjwxk.leetcode._0230_Kth_Smallest_Element_in_a_BST;

import com.zjxjwxk.leetcode.util.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 记录子树的结点数
 * @author Xinkang Wu
 * @date 2021/10/17 15:01
 */
public class Solution2 {

    public int kthSmallest(TreeNode root, int k) {
        MyBst myBst = new MyBst(root);
        return myBst.kthSmallest(root, k);
    }

    static class MyBst {
        public TreeNode root;
        public Map<TreeNode, Integer> countMap;

        public MyBst(TreeNode root) {
            this.root = root;
            this.countMap = new HashMap<>();
            count(root);
        }

        public int kthSmallest(TreeNode root, int k) {
            while (root != null) {
                int leftCount = getCount(root.left);
                if (leftCount < k - 1) {
                    root = root.right;
                    k = k - leftCount - 1;
                } else if (leftCount > k - 1) {
                    root = root.left;
                } else {
                    return root.val;
                }
            }
            return -1;
        }

        private int count(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int count = count(root.left) + count(root.right) + 1;
            countMap.put(root, count);
            return count;
        }

        private int getCount(TreeNode root) {
            return countMap.getOrDefault(root, 0);
        }
    }
}
