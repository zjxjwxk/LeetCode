package com.zjxjwxk.leetcode._1493_Longest_Subarray_of_1_s_After_Deleting_One_Element;

/**
 * 递推优化
 * 时间复杂度O(n)
 * 空间复杂度O(1)
 * @author Xinkang Wu
 * @date 2022/1/4 17:34
 */
public class Solution3 {

    public int longestSubarray(int[] nums) {
        int len = nums.length, leftCount = nums[0], leftWithZeroCount = nums[0], ans = 0;
        for (int i = 1; i < len; ++i) {
            if (nums[i] == 0) {
                leftWithZeroCount = leftCount;
                leftCount = 0;
            } else {
                ++leftCount;
                ++leftWithZeroCount;
            }
            ans = Math.max(ans, leftWithZeroCount);
        }
        return ans == len ? ans - 1 : ans;
    }
}
