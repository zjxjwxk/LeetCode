package com.zjxjwxk.leetcode._0220_Contains_Duplicate_III;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void containsNearbyAlmostDuplicate1() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        int t = 0;
        assertTrue(solution2.containsNearbyAlmostDuplicate(nums, k, t));
    }

    @Test
    void containsNearbyAlmostDuplicate2() {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        int t = 2;
        assertTrue(solution2.containsNearbyAlmostDuplicate(nums, k, t));
    }

    @Test
    void containsNearbyAlmostDuplicate3() {
        int[] nums = {1, 5, 9, 1, 5, 9};
        int k = 2;
        int t = 3;
        assertFalse(solution2.containsNearbyAlmostDuplicate(nums, k, t));
    }

    @Test
    void containsNearbyAlmostDuplicate4() {
        int[] nums = {2147483640, 2147483641};
        int k = 1;
        int t = 100;
        assertTrue(solution2.containsNearbyAlmostDuplicate(nums, k, t));
    }
}