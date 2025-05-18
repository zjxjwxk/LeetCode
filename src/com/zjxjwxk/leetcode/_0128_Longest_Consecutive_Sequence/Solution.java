package com.zjxjwxk.leetcode._0128_Longest_Consecutive_Sequence;

import java.util.HashSet;
import java.util.Set;

/**
 * 哈希表
 *
 * @author Xinkang Wu
 * @date 2025/5/18 23:52
 */
public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int ans = 0;
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        for (Integer num : numSet) {
            if (numSet.contains(num - 1)) {
                continue;
            }
            int curNum = num;
            while (numSet.contains(curNum)) {
                ++curNum;
            }
            ans = Math.max(ans, curNum - num);
        }
        return ans;
    }
}
