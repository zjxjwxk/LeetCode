package com.zjxjwxk.leetcode._0930_Binary_Subarrays_With_Sum;

import java.util.HashMap;
import java.util.Map;

/**
 * 哈希表
 * @author Xinkang Wu
 * @date 2021/7/8 19:51
 */
public class Solution {

    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum = 0, ans = 0;
        Map<Integer, Integer> sumCountMap = new HashMap<>();
        for (int num : nums) {
            sumCountMap.merge(sum, 1, Integer::sum);
            sum += num;
            ans += sumCountMap.getOrDefault(sum - goal, 0);
        }
        return ans;
    }
}
