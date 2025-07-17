package com.zjxjwxk.leetcode._0108_Convert_Sorted_Array_to_Binary_Search_Tree;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sortedArrayToBST() {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        TreeNode ans = DSFactory.newTree(new Integer[]{0, -10, 5, null, -3, null, 9});
        assertEquals(ans, solution.sortedArrayToBST(nums));
    }

    @Test
    void sortedArrayToBST2() {
        int[] nums = new int[]{1, 3};
        TreeNode ans = DSFactory.newTree(new Integer[]{1, null, 3});
        assertEquals(ans, solution.sortedArrayToBST(nums));
    }
}