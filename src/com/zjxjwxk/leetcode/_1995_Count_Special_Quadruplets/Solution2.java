package com.zjxjwxk.leetcode._1995_Count_Special_Quadruplets;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用哈希表存储nums[d]
 * @author Xinkang Wu
 * @date 2021/12/29 11:19
 */
public class Solution2 {

    public int countQuadruplets(int[] nums) {
        int len = nums.length, ans = 0;
        for (int a = 0; a < len - 3; ++a) {
            for (int b = a + 1; b < len - 2; ++b) {
                Map<Integer, Integer> countMap = new HashMap<>();
                for (int c = len - 2; c >= b + 1; --c) {
                    countMap.merge(nums[c + 1], 1, Integer::sum);
                    ans += countMap.getOrDefault(nums[a] + nums[b] + nums[c], 0);
                }
            }
        }
        return ans;
    }
}
