package com.zjxjwxk.leetcode._0594_Longest_Harmonious_Subsequence;

import java.util.HashMap;
import java.util.Map;

/**
 * 哈希表
 * @author Xinkang Wu
 * @date 2021/11/20 14:38
 */
public class Solution {

    public int findLHS(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.merge(num, 1, Integer::sum);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            Integer nextCount = countMap.get(entry.getKey() + 1);
            if (nextCount != null) {
                ans = Math.max(ans, entry.getValue() + nextCount);
            }
        }
        return ans;
    }
}
