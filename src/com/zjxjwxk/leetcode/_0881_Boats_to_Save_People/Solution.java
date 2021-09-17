package com.zjxjwxk.leetcode._0881_Boats_to_Save_People;

import java.util.Arrays;

/**
 * 贪心
 * @author Xinkang Wu
 * @date 2021/9/17 14:52
 */
public class Solution {

    public int numRescueBoats(int[] people, int limit) {
        int left = 0, right = people.length - 1, ans = 0;
        Arrays.sort(people);
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                ++left;
            }
            --right;
            ++ans;
        }
        return ans;
    }
}
