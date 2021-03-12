package com.zjxjwxk.leetcode._0331_Verify_Preorder_Serialization_of_a_Binary_Tree;

/**
 * 前序遍历
 * @author Xinkang Wu
 * @date 2021/3/12 11:13
 */
public class Solution {

    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        return preorder(nodes, 0) == nodes.length - 1;
    }

    /**
     * 前序遍历
     *
     * @param nodes 节点数组
     * @param index 当前节点在数组中的下标
     * @return 遍历完当前节点左右子树后，所遍历的最后一个节点在数组中的下标
     */
    private int preorder(String[] nodes, int index) {
        // 空节点
        if (nodes[index].equals("#")) {
            return index;
        }
        // 数字节点
        // 其左孩子没有可以填充的节点
        if (index == nodes.length - 1) {
            return -1;
        }
        int curIndex = preorder(nodes, index + 1);
        // 其下层已经出现错误，或其右孩子没有可以填充的节点
        if (curIndex == -1 || curIndex == nodes.length - 1) {
            return -1;
        }
        return preorder(nodes, curIndex + 1);
    }
}
