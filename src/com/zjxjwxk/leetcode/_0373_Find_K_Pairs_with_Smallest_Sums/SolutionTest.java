package com.zjxjwxk.leetcode._0373_Find_K_Pairs_with_Smallest_Sums;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void kSmallestPairs() {
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        int k = 3;
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {1, 2}, {1, 4}, {1, 6}
        });
        assertEquals(ans, solution.kSmallestPairs(nums1, nums2, k));
    }

    @Test
    void kSmallestPairs2() {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {1, 2, 3};
        int k = 2;
        List<List<Integer>> ans = DSFactory.newArrayList(new Integer[][]{
                {1, 1}, {1, 1}
        });
        assertEquals(ans, solution.kSmallestPairs(nums1, nums2, k));
    }
}