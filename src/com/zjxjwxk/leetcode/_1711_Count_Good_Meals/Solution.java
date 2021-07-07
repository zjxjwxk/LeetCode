package com.zjxjwxk.leetcode._1711_Count_Good_Meals;

import java.util.HashMap;
import java.util.Map;

/**
 * 哈希表
 * @author Xinkang Wu
 * @date 2021/7/7 20:37
 */
public class Solution {

    public static final int MOD = 1000000007;

    public int countPairs(int[] deliciousness) {
        int ans = 0, maxVal = 0;
        for (int val : deliciousness) {
            maxVal = Math.max(maxVal, val);
        }
        int maxSum = (maxVal << 1);
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int val : deliciousness) {
            for (int sum = 1; sum <= maxSum; sum <<= 1) {
                ans = (ans + countMap.getOrDefault(sum - val, 0)) % MOD;
            }
            countMap.merge(val, 1, Integer::sum);
        }
        return ans;
    }
}
