package com.zjxjwxk.leetcode._1610_Maximum_Number_of_Visible_Points;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.DSUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void visiblePoints1() {
        int[][] points = {{2, 1}, {2, 2}, {3, 3}};
        int angle = 90;
        int[] location = {1, 1};
        int ans = 3;
        assertEquals(ans, solution.visiblePoints(DSFactory.newArrayList(DSUtil.boxIntArr(points)), angle, Arrays.stream(location).boxed().collect(Collectors.toList())));
    }

    @Test
    void visiblePoints2() {
        int[][] points = {{2, 1}, {2, 2}, {3, 4}, {1, 1}};
        int angle = 90;
        int[] location = {1, 1};
        int ans = 4;
        assertEquals(ans, solution.visiblePoints(DSFactory.newArrayList(DSUtil.boxIntArr(points)), angle, Arrays.stream(location).boxed().collect(Collectors.toList())));
    }

    @Test
    void visiblePoints3() {
        int[][] points = {{1, 0}, {2, 1}};
        int angle = 13;
        int[] location = {1, 1};
        int ans = 1;
        assertEquals(ans, solution.visiblePoints(DSFactory.newArrayList(DSUtil.boxIntArr(points)), angle, Arrays.stream(location).boxed().collect(Collectors.toList())));
    }

    @Test
    void visiblePoints4() {
        int[][] points = {{1, 1}, {2, 2}, {1, 2}, {2, 1}};
        int angle = 0;
        int[] location = {1, 1};
        int ans = 2;
        assertEquals(ans, solution.visiblePoints(DSFactory.newArrayList(DSUtil.boxIntArr(points)), angle, Arrays.stream(location).boxed().collect(Collectors.toList())));
    }
}