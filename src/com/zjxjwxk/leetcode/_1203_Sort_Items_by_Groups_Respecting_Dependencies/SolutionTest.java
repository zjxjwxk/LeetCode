package com.zjxjwxk.leetcode._1203_Sort_Items_by_Groups_Respecting_Dependencies;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.DSUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sortItems1() {
        int n = 8, m = 2;
        int[] group = {-1, -1, 1, 0, 0, 1, 0, -1};
        List<List<Integer>> beforeItems = DSFactory.newArrayList(new Integer[][]{
                {}, {6}, {5}, {6}, {3, 6}, {}, {}, {}
        });
        DSUtil.printlnArr(Arrays.stream(solution.sortItems(n, m, group, beforeItems)).boxed().toArray(Integer[]::new));
    }

    @Test
    void sortItems2() {
        int n = 8, m = 2;
        int[] group = {-1, -1, 1, 0, 0, 1, 0, -1};
        List<List<Integer>> beforeItems = DSFactory.newArrayList(new Integer[][]{
                {}, {6}, {5}, {6}, {3}, {}, {4}, {}
        });
        DSUtil.printlnArr(Arrays.stream(solution.sortItems(n, m, group, beforeItems)).boxed().toArray(Integer[]::new));
    }
}