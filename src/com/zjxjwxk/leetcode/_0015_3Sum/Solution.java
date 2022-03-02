package com.zjxjwxk.leetcode._0015_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 排序+双指针
 * @author Xinkang Wu
 * @date 2022/3/2 16:17
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if (len < 3) {
            return ans;
        }
        Arrays.sort(nums);
        for (int i = 0; i <= len - 3; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int k = len - 1;
            for (int j = i + 1; j <= len - 2 && j < k; ++j) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                while (j < k && -(nums[i] + nums[j]) < nums[k]) {
                    --k;
                }
                if (j < k && -(nums[i] + nums[j]) == nums[k]) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
            }
        }
        return ans;
    }
}
