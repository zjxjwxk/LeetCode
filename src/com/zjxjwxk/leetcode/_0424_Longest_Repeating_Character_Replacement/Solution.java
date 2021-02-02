package com.zjxjwxk.leetcode._0424_Longest_Repeating_Character_Replacement;

/**
 * 滑动窗口
 * @author Xinkang Wu
 * @date 2021/2/2 13:07
 */
public class Solution {

    public int characterReplacement(String s, int k) {
        int len = s.length(), i = 0, j = 0, maxRepeat = 0;
        char[] charArr = s.toCharArray();
        int[] counts = new int[26];
        while (j < len) {
            maxRepeat = Math.max(maxRepeat, ++counts[charArr[j] - 'A']);
            if (j - i + 1 - maxRepeat > k) {
                --counts[charArr[i] - 'A'];
                ++i;
            }
            ++j;
        }
        return j - i;
    }
}
