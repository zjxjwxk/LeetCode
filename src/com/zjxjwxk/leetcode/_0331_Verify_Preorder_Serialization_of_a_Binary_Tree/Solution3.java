package com.zjxjwxk.leetcode._0331_Verify_Preorder_Serialization_of_a_Binary_Tree;

/**
 * 计数
 * 空间复杂度O(1)
 * @author Xinkang Wu
 * @date 2021/3/12 13:28
 */
public class Solution3 {

    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        int len = nodes.length, nodeIndex = 0, count = 0;
        if (!nodes[nodeIndex++].equals("#")) {
            count += 2;
        }
        while (count > 0 && nodeIndex < len) {
            --count;
            if (!nodes[nodeIndex++].equals("#")) {
                count += 2;
            }
        }
        return count == 0 && nodeIndex == len;
    }
}
