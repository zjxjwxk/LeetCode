package com.zjxjwxk.leetcode._0015_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 排序+双指针2
 * @author Xinkang Wu
 * @date 2024/3/9 23:33
 */
public class Solution2 {

    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < len - 2; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1, right = len - 1, target = -(nums[i]);
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum < target) {
                    ++left;
                } else if (sum > target) {
                    --right;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    do {
                        ++left;
                    } while (left < right && nums[left] == nums[left - 1]);
                }
            }
        }
        return ans;
    }
}
