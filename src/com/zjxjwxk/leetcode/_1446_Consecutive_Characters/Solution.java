package com.zjxjwxk.leetcode._1446_Consecutive_Characters;

/**
 * 一次遍历
 * @author Xinkang Wu
 * @date 2021/12/1 18:35
 */
public class Solution {

    public int maxPower(String s) {
        int ans = 1, count = 1;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                ++count;
                ans = Math.max(ans, count);
            } else {
                count = 1;
            }
        }
        return ans;
    }
}
