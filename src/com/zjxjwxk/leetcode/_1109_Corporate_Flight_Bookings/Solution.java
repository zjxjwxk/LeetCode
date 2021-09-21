package com.zjxjwxk.leetcode._1109_Corporate_Flight_Bookings;

/**
 * 暴力
 * @author Xinkang Wu
 * @date 2021/9/20 19:02
 */
public class Solution {

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        for (int[] booking : bookings) {
            for (int i = booking[0]; i <= booking[1]; ++i) {
                ans[i - 1] += booking[2];
            }
        }
        return ans;
    }
}
