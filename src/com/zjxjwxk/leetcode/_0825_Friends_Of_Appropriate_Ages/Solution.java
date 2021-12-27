package com.zjxjwxk.leetcode._0825_Friends_Of_Appropriate_Ages;

import java.util.Arrays;

/**
 * @author Xinkang Wu
 * @date 2021/12/27 13:39
 */
public class Solution {

    public int numFriendRequests(int[] ages) {
        int n = ages.length, ans = 0, left = 0, right = 0;
        Arrays.sort(ages);
        for (int age : ages) {
            if (age <= 14) {
                continue;
            }
            while (ages[left] <= age * 0.5 + 7) {
                ++left;
            }
            while (right + 1 < n && ages[right + 1] <= age) {
                ++right;
            }
            ans += right - left;
        }
        return ans;
    }
}
