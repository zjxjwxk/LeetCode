package com.zjxjwxk.leetcode._0055_Jump_Game;

/**
 * 贪心
 *
 * @author Xinkang Wu
 * @date 2025/8/16 15:26
 */
public class Solution {

    public boolean canJump(int[] nums) {
        int farthest = 0;
        for (int i = 0; i <= farthest; ++i) {
            if (farthest >= nums.length - 1) {
                return true;
            }
            farthest = Math.max(farthest, i + nums[i]);
        }
        return false;
    }
}
