package com.zjxjwxk.leetcode._0560_Subarray_Sum_Equals_K;

import java.util.HashMap;
import java.util.Map;

/**
 * 前缀和+哈希表
 * @author Xinkang Wu
 * @date 2022/1/23 11:14
 */
public class Solution2 {

    public int subarraySum(int[] nums, int k) {
        int preSum = 0, ans = 0;
        Map<Integer, Integer> preSumCountMap = new HashMap<>();
        preSumCountMap.put(0, 1);
        for (int num : nums) {
            preSum += num;
            ans += preSumCountMap.getOrDefault(preSum - k, 0);
            preSumCountMap.merge(preSum, 1, Integer::sum);
        }
        return ans;
    }
}
