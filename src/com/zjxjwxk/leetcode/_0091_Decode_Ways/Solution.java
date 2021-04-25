package com.zjxjwxk.leetcode._0091_Decode_Ways;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/4/21 22:19
 */
public class Solution {

    public int numDecodings(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();
        int dp1 = 1, dp2 = 1, dp3 = 0;
        for (int i = 0; i < len; ++i) {
            dp3 = 0;
            if (chars[i] != '0') {
                dp3 += dp2;
            }
            if (i >= 1 && chars[i - 1] != '0' && ((chars[i - 1] - '0') * 10 + chars[i] - '0') <= 26) {
                dp3 += dp1;
            }
            dp1 = dp2;
            dp2 = dp3;
        }
        return dp3;
    }
}
