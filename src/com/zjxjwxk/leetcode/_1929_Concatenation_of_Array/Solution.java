package com.zjxjwxk.leetcode._1929_Concatenation_of_Array;

/**
 * @author Xinkang Wu
 * @date 2026/3/18 21:40
 */
public class Solution {

    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len << 1];
        for (int i = 0; i < len; ++i) {
            ans[i] = ans[len + i] = nums[i];
        }
        return ans;
    }
}
