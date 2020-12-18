package com.zjxjwxk.leetcode._0389_Find_the_Difference;

/**
 * 位运算
 * @author Xinkang Wu
 * @date 2020/12/18 22:05
 */
public class Solution3 {

    public char findTheDifference(String s, String t) {
        int ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            ans ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            ans ^= t.charAt(i);
        }
        return (char) ans;
    }
}
