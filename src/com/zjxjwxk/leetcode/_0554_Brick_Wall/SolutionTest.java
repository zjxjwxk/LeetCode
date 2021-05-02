package com.zjxjwxk.leetcode._0554_Brick_Wall;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void leastBricks1() {
        List<List<Integer>> wall = DSFactory.newArrayList(new Integer[][]{
                {1, 2, 2, 1}, {3, 1, 2}, {1, 3, 2}, {2, 4}, {3, 1, 2}, {1, 3, 1, 1}
        });
        int ans = 2;
        assertEquals(ans, solution.leastBricks(wall));
    }

    @Test
    void leastBricks2() {
        List<List<Integer>> wall = DSFactory.newArrayList(new Integer[][]{
                {1}, {1}, {1}
        });
        int ans = 3;
        assertEquals(ans, solution.leastBricks(wall));
    }
}