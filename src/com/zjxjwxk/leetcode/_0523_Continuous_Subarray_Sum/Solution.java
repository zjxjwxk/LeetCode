package com.zjxjwxk.leetcode._0523_Continuous_Subarray_Sum;

import java.util.HashMap;
import java.util.Map;

/**
 * 前缀和 + 哈希表
 * @author Xinkang Wu
 * @date 2021/6/2 14:54
 */
public class Solution {

    public boolean checkSubarraySum(int[] nums, int k) {
        int len = nums.length, remainder = 0;
        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1);
        for (int i = 0; i < len; ++i) {
            remainder = (remainder + nums[i]) % k;
            Integer leftIndex = remainderMap.get(remainder);
            if (leftIndex == null) {
                remainderMap.put(remainder, i);
            } else {
                if (i - leftIndex >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
