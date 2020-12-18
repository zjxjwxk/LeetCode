package com.zjxjwxk.leetcode._0389_Find_the_Difference;

/**
 * 求和
 * @author Xinkang Wu
 * @date 2020/12/18 21:41
 */
public class Solution2 {

    public char findTheDifference(String s, String t) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < s.length(); ++i) {
            sum1 += s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            sum2 += t.charAt(i);
        }
        return (char) (sum2 - sum1);
    }
}
