package com.zjxjwxk.leetcode._0015_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 排序+双指针3
 * @author Xinkang Wu
 * @date 2024/3/10 00:07
 */
public class Solution3 {

    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < len - 2; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1, right = len - 1, target = -nums[i];
            while (left < right) {
                while (left < right
                    && (((nums[left] + nums[right]) < target)
                        || (left > (i + 1) && nums[left] == nums[left - 1]))) {
                    ++left;
                }
                while (left < right && (nums[left] + nums[right]) > target) {
                    --right;
                }
                if (left < right && (nums[left] + nums[right]) == target) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    ++left;
                }
            }
        }
        return ans;
    }
}
