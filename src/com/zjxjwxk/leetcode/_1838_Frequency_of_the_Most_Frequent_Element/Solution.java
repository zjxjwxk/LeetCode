package com.zjxjwxk.leetcode._1838_Frequency_of_the_Most_Frequent_Element;

import java.util.Arrays;

/**
 * 排序 + 滑动窗口
 * @author Xinkang Wu
 * @date 2021/7/19 20:18
 */
public class Solution {

    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = 1, len = nums.length, sum = 0, ans = 1;
        while (right < len) {
            sum += (nums[right] - nums[right - 1]) * (right - left);
            while (sum > k) {
                sum -= nums[right] - nums[left++];
            }
            ans = Math.max(ans, right - left + 1);
            ++right;
        }
        return ans;
    }
}
