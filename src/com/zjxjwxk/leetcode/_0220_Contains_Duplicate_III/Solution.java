package com.zjxjwxk.leetcode._0220_Contains_Duplicate_III;

import java.util.TreeSet;

/**
 * 滑动窗口+有序集合
 * @author Xinkang Wu
 * @date 2021/4/17 13:27
 */
public class Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int len = nums.length;
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < len; ++i) {
            Long ceiling = set.ceiling(((long) nums[i] - (long) t));
            if (ceiling != null && ceiling <= (long) nums[i] + (long) t) {
                return true;
            }
            set.add((long) nums[i]);
            if (set.size() > k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }
}
