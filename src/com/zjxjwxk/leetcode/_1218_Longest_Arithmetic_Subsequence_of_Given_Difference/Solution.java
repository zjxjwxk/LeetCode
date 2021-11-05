package com.zjxjwxk.leetcode._1218_Longest_Arithmetic_Subsequence_of_Given_Difference;

import java.util.HashMap;
import java.util.Map;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/11/5 11:25
 */
public class Solution {

    public int longestSubsequence(int[] arr, int difference) {
        int maxLen = 0;
        Map<Integer, Integer> dp = new HashMap<>();
        for (int num : arr) {
            int curLen = dp.getOrDefault(num - difference, 0) + 1;
            dp.put(num, curLen);
            maxLen = Math.max(maxLen, curLen);
        }
        return maxLen;
    }
}
