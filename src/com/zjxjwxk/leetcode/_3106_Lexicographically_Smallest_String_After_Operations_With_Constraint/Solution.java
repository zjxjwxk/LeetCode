package com.zjxjwxk.leetcode._3106_Lexicographically_Smallest_String_After_Operations_With_Constraint;

/**
 * @author Xinkang Wu
 * @date 2024/7/27 01:58
 */
public class Solution {

    public String getSmallestString(String s, int k) {
        if (k == 0) {
            return s;
        }
        char[] ans = s.toCharArray();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            int dis = Math.min(ch - 'a', 'z' - ch + 1);
            if (k >= dis) {
                ans[i] = 'a';
                k -= dis;
            } else {
                ans[i] = (char) (ch - k);
                break;
            }
        }
        return new String(ans);
    }
}
