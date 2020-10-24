package com.zjxjwxk.leetcode._1024_Video_Stitching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void videoStitching1() {
        int[][] clips = {{0, 2}, {4, 6}, {8, 10}, {1, 9}, {1, 5}, {5, 9}};
        int T = 10, ans = 3;
        assertEquals(ans, solution.videoStitching(clips, T));
    }

    @Test
    void videoStitching2() {
        int[][] clips = {{0, 1}, {1, 2}};
        int T = 5, ans = -1;
        assertEquals(ans, solution.videoStitching(clips, T));
    }

    @Test
    void videoStitching3() {
        int[][] clips = {{0, 4}, {2, 8}};
        int T = 5, ans = 2;
        assertEquals(ans, solution.videoStitching(clips, T));
    }

    @Test
    void videoStitching4() {
        int[][] clips = {{5, 7}, {1, 8}, {0, 0}, {2, 3}, {4, 5}, {0, 6}, {5, 10}, {7, 10}};
        int T = 5, ans = 1;
        assertEquals(ans, solution.videoStitching(clips, T));
    }

    @Test
    void videoStitching5() {
        int[][] clips = {{11, 28}, {35, 40}, {28, 38}, {0, 10}, {37, 39}, {40, 40}, {18, 34}, {32, 38}, {14, 36}, {33, 36}};
        int T = 8, ans = 1;
        assertEquals(ans, solution.videoStitching(clips, T));
    }
}