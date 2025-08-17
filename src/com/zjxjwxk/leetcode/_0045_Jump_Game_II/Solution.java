package com.zjxjwxk.leetcode._0045_Jump_Game_II;

/**
 * 贪心
 *
 * @author Xinkang Wu
 * @date 2025/8/17 14:51
 */
public class Solution {

    public int jump(int[] nums) {
        int i = 0, count = 0, farthest = nums[0];
        while (i < nums.length - 1) {
            int nextFarthest = 0;
            while (i < nums.length && i <= farthest) {
                nextFarthest = Math.max(nextFarthest, i + nums[i]);
                ++i;
            }
            farthest = nextFarthest;
            if (farthest >= nums.length - 1) {
                return count + 2;
            }
            ++count;
        }
        return count;
    }
}
