package com.zjxjwxk.leetcode._0611_Valid_Triangle_Number;

import java.util.Arrays;

/**
 * 排序+双指针
 * @author Xinkang Wu
 * @date 2021/8/28 14:16
 */
public class Solution2 {

    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0, len = nums.length, ans = 0;
        while (i < len && nums[i] == 0) {
            ++i;
        }
        for (; i < len - 2; ++i) {
            int right = i + 2;
            for (int j = i + 1; j < len - 1; ++j) {
                while (right < len && nums[i] + nums[j] > nums[right]) {
                    ++right;
                }
                ans += right - j - 1;
            }
        }
        return ans;
    }
}
