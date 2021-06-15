package com.zjxjwxk.leetcode._1449_Form_Largest_Integer_With_Digits_That_Add_up_to_Target;

import java.util.*;

/**
 * 动态规划（数字字符串）
 * @author Xinkang Wu
 * @date 2021/6/15 21:58
 */
public class Solution {

    public String largestNumber(int[] cost, int target) {
        Map<Integer, Integer> costToNumMap = new HashMap<>();
        for (int i = 0; i < cost.length; ++i) {
            costToNumMap.merge(cost[i], i + 1, Integer::max);
        }
        String[] dp = new String[target + 1];
        dp[0] = "";
        Set<Map.Entry<Integer, Integer>> entryList = new TreeSet<>((entry1, entry2) -> entry2.getValue() - entry1.getValue());
        entryList.addAll(costToNumMap.entrySet());
        for (Map.Entry<Integer, Integer> entry : entryList) {
            for (int j = entry.getKey(); j <= target; ++j) {
                if (dp[j - entry.getKey()] != null) {
                    String newStr = dp[j - entry.getKey()] + entry.getValue();
                    if (dp[j] == null || newStr.length() > dp[j].length() || (newStr.length() == dp[j].length() && newStr.compareTo(dp[j]) > 0)) {
                        dp[j] = newStr;
                    }
                }
            }
        }
        return dp[target] == null ? "0" : dp[target];
    }
}
