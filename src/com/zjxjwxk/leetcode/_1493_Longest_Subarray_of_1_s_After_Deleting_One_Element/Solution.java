package com.zjxjwxk.leetcode._1493_Longest_Subarray_of_1_s_After_Deleting_One_Element;

/**
 * 状态机
 * 时间复杂度O(n)
 * 空间复杂度O(1)
 * @author Xinkang Wu
 * @date 2022/1/4 17:34
 */
public class Solution {

    public int longestSubarray(int[] nums) {
        int leftCount = 0, rightCount = 0, ans = 0;
        boolean curLeft = true;
        for (int num : nums) {
            if (num == 1) {
                if (curLeft) {
                    ++leftCount;
                } else {
                    ++rightCount;
                }
            } else {
                if (curLeft) {
                    curLeft = false;
                } else {
                    ans = Math.max(ans, leftCount + rightCount);
                    leftCount = rightCount;
                    rightCount = 0;
                }
            }
        }
        ans = Math.max(ans, leftCount + rightCount);
        return ans == nums.length ? ans - 1 : ans;
    }
}
