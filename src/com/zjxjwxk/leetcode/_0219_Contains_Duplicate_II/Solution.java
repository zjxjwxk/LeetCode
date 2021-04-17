package com.zjxjwxk.leetcode._0219_Contains_Duplicate_II;

import java.util.HashSet;
import java.util.Set;

/**
 * 哈希表
 * @author Xinkang Wu
 * @date 2021/4/17 12:16
 */
public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
