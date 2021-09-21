package com.zjxjwxk.leetcode._1109_Corporate_Flight_Bookings;

/**
 * 差分
 * @author Xinkang Wu
 * @date 2021/9/20 19:02
 */
public class Solution2 {

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] d = new int[n];
        for (int[] booking : bookings) {
            d[booking[0] - 1] += booking[2];
            if (booking[1] < n) {
                d[booking[1]] -= booking[2];
            }
        }
        for (int i = 1; i < n; ++i) {
            d[i] += d[i - 1];
        }
        return d;
    }
}
