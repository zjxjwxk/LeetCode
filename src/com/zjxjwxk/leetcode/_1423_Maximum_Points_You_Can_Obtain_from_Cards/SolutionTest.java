package com.zjxjwxk.leetcode._1423_Maximum_Points_You_Can_Obtain_from_Cards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxScore1() {
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        int ans = 12;
        assertEquals(ans, solution.maxScore(cardPoints, k));
    }

    @Test
    void maxScore2() {
        int[] cardPoints = {2, 2, 2};
        int k = 2;
        int ans = 4;
        assertEquals(ans, solution.maxScore(cardPoints, k));
    }

    @Test
    void maxScore3() {
        int[] cardPoints = {9, 7, 7, 9, 7, 7, 9};
        int k = 7;
        int ans = 55;
        assertEquals(ans, solution.maxScore(cardPoints, k));
    }

    @Test
    void maxScore4() {
        int[] cardPoints = {1, 1000, 1};
        int k = 1;
        int ans = 1;
        assertEquals(ans, solution.maxScore(cardPoints, k));
    }

    @Test
    void maxScore5() {
        int[] cardPoints = {1, 79, 80, 1, 1, 1, 200, 1};
        int k = 3;
        int ans = 202;
        assertEquals(ans, solution.maxScore(cardPoints, k));
    }
}