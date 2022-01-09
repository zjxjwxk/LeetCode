package com.zjxjwxk.leetcode._1248_Count_Number_of_Nice_Subarrays;

/**
 * 滑动窗口
 * @author Xinkang Wu
 * @date 2022/1/8 20:41
 */
public class Solution {

    public int numberOfSubarrays(int[] nums, int k) {
        int left = -1, right = -1, preLeft = -1, preRight, len = nums.length, ans = 0;
        for (int i = 0; i < len; ++i) {
            if ((nums[i] & 1) == 1) {
                --k;
                if (left == -1) {
                    left = i;
                }
                if (k == 0) {
                    right = i;
                    break;
                }
            }
        }
        if (left == -1 || right == -1) {
            return 0;
        }
        while (right < len) {
            preRight = right;
            do {
                ++right;
            } while (right < len && ((nums[right] & 1) == 0));
            ans += (left - preLeft) * (right - preRight);
            preLeft = left;
            do {
                ++left;
            } while (left < len && ((nums[left] & 1) == 0));
        }
        return ans;
    }
}
