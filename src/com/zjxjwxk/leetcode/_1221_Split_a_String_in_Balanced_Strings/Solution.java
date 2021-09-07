package com.zjxjwxk.leetcode._1221_Split_a_String_in_Balanced_Strings;

/**
 * 贪心
 * @author Xinkang Wu
 * @date 2021/9/7 10:45
 */
public class Solution {

    public int balancedStringSplit(String s) {
        char[] chArr = s.toCharArray();
        int count = 0, ans = 0;
        for (char ch : chArr) {
            if (ch == 'L') {
                ++count;
            } else {
                --count;
            }
            if (count == 0) {
                ++ans;
            }
        }
        return ans;
    }
}
