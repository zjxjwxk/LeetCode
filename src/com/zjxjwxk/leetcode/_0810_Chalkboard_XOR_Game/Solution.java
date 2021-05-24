package com.zjxjwxk.leetcode._0810_Chalkboard_XOR_Game;

/**
 * 数学
 * @author Xinkang Wu
 * @date 2021/5/22 14:52
 */
public class Solution {

    public boolean xorGame(int[] nums) {
        int len = nums.length;
        if ((len & 1) == 0) {
            return true;
        }
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor == 0;
    }
}
