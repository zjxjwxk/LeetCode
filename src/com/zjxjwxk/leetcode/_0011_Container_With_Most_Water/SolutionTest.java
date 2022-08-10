package com.zjxjwxk.leetcode._0011_Container_With_Most_Water;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zjxjwxk
 * @date 2022/8/10 22:12
 */
class SolutionTest {

    private final Solution solution = new Solution();
    @Test
    void maxArea1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int ans = 49;
        assertEquals(ans, solution.maxArea(height));
    }

    @Test
    void maxArea2() {
        int[] height = {1, 1};
        int ans = 1;
        assertEquals(ans, solution.maxArea(height));
    }
}