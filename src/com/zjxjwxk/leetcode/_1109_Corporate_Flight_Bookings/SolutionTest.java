package com.zjxjwxk.leetcode._1109_Corporate_Flight_Bookings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void corpFlightBookings1() {
        int[][] bookings = {
                {1, 2, 10}, {2, 3, 20}, {2, 5, 25}
        };
        int n = 5;
        int[] ans = {10, 55, 45, 25, 25};
        assertArrayEquals(ans, solution.corpFlightBookings(bookings, n));
    }

    @Test
    void corpFlightBookings2() {
        int[][] bookings = {
                {1, 2, 10}, {2, 2, 15}
        };
        int n = 2;
        int[] ans = {10, 25};
        assertArrayEquals(ans, solution.corpFlightBookings(bookings, n));
    }
}