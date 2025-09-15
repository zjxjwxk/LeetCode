package com.zjxjwxk.leetcode._0287_Find_the_Duplicate_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findDuplicate() {
        int[] head = {1, 3, 4, 2, 2};
        int ans = 2;
        assertEquals(ans, solution.findDuplicate(head));
    }

    @Test
    void findDuplicate2() {
        int[] head = {3, 1, 3, 4, 2};
        int ans = 3;
        assertEquals(ans, solution.findDuplicate(head));
    }

    @Test
    void findDuplicate3() {
        int[] head = {3, 3, 3, 3, 3};
        int ans = 3;
        assertEquals(ans, solution.findDuplicate(head));
    }
}