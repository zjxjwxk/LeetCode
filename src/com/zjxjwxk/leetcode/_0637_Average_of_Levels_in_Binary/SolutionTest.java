package com.zjxjwxk.leetcode._0637_Average_of_Levels_in_Binary;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void averageOfLevels() {
        TreeNode root = DSFactory.newTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        List<Double> ans = Arrays.asList(3.00000, 14.50000, 11.00000);
        assertEquals(ans, solution.averageOfLevels(root));
    }

    @Test
    void averageOfLevels2() {
        TreeNode root = DSFactory.newTree(new Integer[]{3, 9, 20, 15, 7});
        List<Double> ans = Arrays.asList(3.00000, 14.50000, 11.00000);
        assertEquals(ans, solution.averageOfLevels(root));
    }
}