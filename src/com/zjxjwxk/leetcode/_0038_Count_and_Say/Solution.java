package com.zjxjwxk.leetcode._0038_Count_and_Say;

/**
 * @author Xinkang Wu
 * @date 2021/10/15 11:07
 */
public class Solution {

    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");
        for (int i = 0; i < n - 1; ++i) {
            int begin = 0;
            StringBuilder nextSb = new StringBuilder();
            for (int j = 1; j <= sb.length(); ++j) {
                if (j == sb.length() || sb.charAt(j) != sb.charAt(begin)) {
                    nextSb.append(j - begin).append(sb.charAt(begin));
                    begin = j;
                }
            }
            sb = nextSb;
        }
        return sb.toString();
    }
}
