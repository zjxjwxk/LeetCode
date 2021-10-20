package com.zjxjwxk.leetcode._0453_Minimum_Moves_to_Equal_Array_Elements;

/**
 * 数学
 * @author Xinkang Wu
 * @date 2021/10/20 15:09
 */
public class Solution {

    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE, ans = 0;
        for (int num : nums) {
            min = Math.min(min, num);
        }
        for (int num : nums) {
            ans += (num - min);
        }
        return ans;
    }
}
