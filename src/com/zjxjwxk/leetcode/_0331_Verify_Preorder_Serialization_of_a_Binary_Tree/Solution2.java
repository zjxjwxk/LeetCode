package com.zjxjwxk.leetcode._0331_Verify_Preorder_Serialization_of_a_Binary_Tree;

/**
 * 栈
 * 空间复杂度O(n)
 * @author Xinkang Wu
 * @date 2021/3/12 13:28
 */
public class Solution2 {

    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        int len = nodes.length, stackIndex = -1, nodeIndex = 0;
        int[] stack = new int[len];
        if (!nodes[nodeIndex++].equals("#")) {
            stack[++stackIndex] = 2;
        }
        while (stackIndex >= 0 && nodeIndex < len) {
            --stack[stackIndex];
            if (!nodes[nodeIndex++].equals("#")) {
                stack[++stackIndex] = 2;
            }
            while (stackIndex >= 0 && stack[stackIndex] == 0) {
                --stackIndex;
            }
        }
        return stackIndex == -1 && nodeIndex == len;
    }
}
