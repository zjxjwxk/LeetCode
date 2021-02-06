package com.zjxjwxk.leetcode._1208_Get_Equal_Substrings_Within_Budget;

/**
 * 双指针
 * @author Xinkang Wu
 * @date 2021/2/6 15:07
 */
public class Solution {

    public int equalSubstring(String s, String t, int maxCost) {
        int i = 0, j = 0, len = s.length(), cost = 0, ans = 0;
        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();
        int[] costs = new int[len];
        for (int k = 0; k < len; ++k) {
            costs[k] = Math.abs(sCharArr[k] - tCharArr[k]);
        }
        while (j < len) {
            cost += costs[j];
            while (cost > maxCost) {
                cost -= costs[i++];
            }
            ans = Math.max(ans, j - i + 1);
            ++j;
        }
        return ans;
    }
}
