package com.zjxjwxk.leetcode._1493_Longest_Subarray_of_1_s_After_Deleting_One_Element;

/**
 * 递推
 * 时间复杂度O(n)
 * 空间复杂度O(n)
 * @author Xinkang Wu
 * @date 2022/1/4 17:34
 */
public class Solution2 {

    public int longestSubarray(int[] nums) {
        int len = nums.length, ans = 0;
        int[] leftCount = new int[len];
        int[] rightCount = new int[len];
        leftCount[0] = nums[0];
        for (int i = 1; i < len; ++i) {
            if (nums[i] == 0) {
                leftCount[i] = 0;
            } else {
                leftCount[i] = leftCount[i - 1] + nums[i];
            }
        }
        rightCount[len - 1] = nums[len - 1];
        for (int i = len - 2; i >= 0; --i) {
            if (nums[i] == 0) {
                rightCount[i] = 0;
            } else {
                rightCount[i] = rightCount[i + 1] + nums[i];
            }
        }
        for (int i = 0; i < len; ++i) {
            if (i == 0) {
                ans = Math.max(ans, rightCount[i + 1]);
            } else if (i == len - 1) {
                ans = Math.max(ans, leftCount[i - 1]);
            } else {
                ans = Math.max(ans, leftCount[i - 1] + rightCount[i + 1]);
            }
        }
        return ans;
    }
}
