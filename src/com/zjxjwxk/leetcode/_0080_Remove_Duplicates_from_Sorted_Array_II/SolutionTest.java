package com.zjxjwxk.leetcode._0080_Remove_Duplicates_from_Sorted_Array_II;

import com.zjxjwxk.leetcode.util.DSUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void removeDuplicates1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int len = solution.removeDuplicates(nums);
        assertEquals(5, len);
        DSUtil.printlnArrByLength(Arrays.stream(nums).boxed().toArray(), len);
    }

    @Test
    void removeDuplicates2() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int len = solution.removeDuplicates(nums);
        assertEquals(7, len);
        DSUtil.printlnArrByLength(Arrays.stream(nums).boxed().toArray(), len);
    }
}