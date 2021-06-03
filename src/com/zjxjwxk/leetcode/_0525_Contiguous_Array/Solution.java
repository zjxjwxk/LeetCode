package com.zjxjwxk.leetcode._0525_Contiguous_Array;

import java.util.HashMap;
import java.util.Map;

/**
 * 前缀和 + 哈希表
 * @author Xinkang Wu
 * @date 2021/6/3 23:39
 */
public class Solution {

    public int findMaxLength(int[] nums) {
        int len = nums.length, preSum = 0, ans = 0;
        Map<Integer, Integer> preSumIndexMap = new HashMap<>();
        preSumIndexMap.put(0, -1);
        for (int i = 0; i < len; ++i) {
            if (nums[i] == 0) {
                --preSum;
            } else {
                ++preSum;
            }
            Integer preIndex = preSumIndexMap.get(preSum);
            if (preIndex == null) {
                preSumIndexMap.put(preSum, i);
            } else {
                ans = Math.max(ans, i - preIndex);
            }
        }
        return ans;
    }
}
