package com.zjxjwxk.leetcode._1816_Truncate_Sentence;

/**
 * @author Xinkang Wu
 * @date 2021/12/6 13:20
 */
public class Solution {

    public String truncateSentence(String s, int k) {
        int count = 0, i;
        for (i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == ' ') {
                if (++count == k) {
                    break;
                }
            }
        }
        return s.substring(0, i);
    }
}
