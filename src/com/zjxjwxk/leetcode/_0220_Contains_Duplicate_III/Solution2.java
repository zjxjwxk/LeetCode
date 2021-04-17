package com.zjxjwxk.leetcode._0220_Contains_Duplicate_III;

import java.util.HashMap;
import java.util.Map;

/**
 * 桶
 * @author Xinkang Wu
 * @date 2021/4/17 13:27
 */
public class Solution2 {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int len = nums.length;
        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < len; ++i) {
            long id = getId(nums[i], t);
            if (map.get(id) != null) {
                return true;
            }
            Long nearNum = map.get(id - 1);
            if (nearNum != null && (long) nums[i] - nearNum <= t) {
                return true;
            }
            nearNum = map.get(id + 1);
            if (nearNum != null && nearNum - (long) nums[i] <= t) {
                return true;
            }
            map.put(id, (long) nums[i]);
            if (map.size() > k) {
                map.remove(getId(nums[i - k], t));
            }
        }
        return false;
    }

    private long getId(long num, long t) {
        if (num >= 0) {
            return num / (t + 1);
        }
        return (num + 1) / (t + 1) - 1;
    }
}
