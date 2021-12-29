package com.zjxjwxk.leetcode._1995_Count_Special_Quadruplets;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用哈希表存储nums[d]-nums[c]
 * @author Xinkang Wu
 * @date 2021/12/29 11:19
 */
public class Solution3 {

    public int countQuadruplets(int[] nums) {
        int len = nums.length, ans = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int b = len - 3; b >= 1; --b) {
            for (int d = b + 2; d < len; ++d) {
                countMap.merge(nums[d] - nums[b + 1], 1, Integer::sum);
            }
            for (int a = 0; a < b; ++a) {
                ans += countMap.getOrDefault(nums[a] + nums[b], 0);
            }
        }
        return ans;
    }
}
