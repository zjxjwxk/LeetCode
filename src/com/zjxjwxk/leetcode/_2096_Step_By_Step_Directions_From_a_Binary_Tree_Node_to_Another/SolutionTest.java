package com.zjxjwxk.leetcode._2096_Step_By_Step_Directions_From_a_Binary_Tree_Node_to_Another;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void getDirections1() {
        TreeNode root = DSFactory.newTree(new Integer[]{5, 4, 2, 7, 6, null, null, 1, 8, 3, 9});
        String ans = "UURL";
        assertEquals(ans, solution.getDirections(root, 1, 3));
    }

    @Test
    public void getDirections2() {
        TreeNode root = DSFactory.newTree(new Integer[]{5, 1, 2, 3, null, 6, 4});
        String ans = "UURL";
        assertEquals(ans, solution.getDirections(root, 3, 6));
    }

    @Test
    public void getDirections3() {
        TreeNode root = DSFactory.newTree(new Integer[]{2, 1});
        String ans = "L";
        assertEquals(ans, solution.getDirections(root, 2, 1));
    }

    @Test
    public void getDirections4() {
        TreeNode root = DSFactory.newTree(new Integer[]{2, 1});
        String ans = "U";
        assertEquals(ans, solution.getDirections(root, 1, 2));
    }

    @Test
    public void getDirections5() {
        TreeNode root = DSFactory.newTree(new Integer[]{2, null, 1});
        String ans = "R";
        assertEquals(ans, solution.getDirections(root, 2, 1));
    }

    @Test
    public void getDirections6() {
        TreeNode root = DSFactory.newTree(new Integer[]{2, null, 1});
        String ans = "U";
        assertEquals(ans, solution.getDirections(root, 1, 2));
    }
}