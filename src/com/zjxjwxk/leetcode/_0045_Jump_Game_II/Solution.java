package com.zjxjwxk.leetcode._0045_Jump_Game_II;

/**
 * 贪心
 *
 * @author Xinkang Wu
 * @date 2025/8/17 14:51
 */
public class Solution {

    public int jump(int[] nums) {
        int begin = 0, farthest = nums[0], count = 0;
        while (begin < nums.length - 1) {
            int nextFarthest = 0;
            for (int i = begin; i <= farthest && i < nums.length; ++i) {
                nextFarthest = Math.max(nextFarthest, i + nums[i]);
            }
            begin = farthest;
            farthest = nextFarthest;
            ++count;
        }
        return count;
    }
}
