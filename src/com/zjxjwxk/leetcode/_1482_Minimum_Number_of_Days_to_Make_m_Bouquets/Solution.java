package com.zjxjwxk.leetcode._1482_Minimum_Number_of_Days_to_Make_m_Bouquets;

/**
 * 二分
 * @author Xinkang Wu
 * @date 2021/5/9 11:32
 */
public class Solution {

    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) {
            return -1;
        }
        int left = 1, right = Integer.MIN_VALUE, mid;
        for (int day : bloomDay) {
            right = Math.max(right, day);
        }
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (canMake(bloomDay, m, k, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canMake(int[] bloomDay, int m, int k, int minDay) {
        int left = 0, right = 0, len = bloomDay.length;
        while (right < len) {
            if (bloomDay[right] <= minDay) {
                if (right - left + 1 == k) {
                    if (--m == 0) {
                        return true;
                    }
                    left = right + 1;
                }
            } else {
                left = right + 1;
            }
            ++right;
        }
        return false;
    }
}
