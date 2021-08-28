package com.zjxjwxk.leetcode._0611_Valid_Triangle_Number;

import java.util.Arrays;

/**
 * 排序+二分查找
 * @author Xinkang Wu
 * @date 2021/8/28 14:16
 */
public class Solution {

    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0, len = nums.length, ans = 0;
        while (i < len && nums[i] == 0) {
            ++i;
        }
        for (; i < len - 2; ++i) {
            for (int j = i + 1; j < len - 1; ++j) {
                int right = binarySearchRight(nums, j + 1, len - 1, nums[i] + nums[j]);
                ans += right - j;
            }
        }
        return ans;
    }

    private int binarySearchRight(int[] nums, int left, int right, int target) {
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (target <= nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
