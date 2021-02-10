package com.zjxjwxk.leetcode._0567_Permutation_in_String;

/**
 * 滑动窗口
 * @author Xinkang Wu
 * @date 2021/2/10 12:20
 */
public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        int[] counts = new int[26];
        int[] matchCounts = new int[26];
        int len1 = s1.length(), len2 = s2.length(), distinct = 0, matchDistinct = 0;
        for (int i = 0; i < len1; ++i) {
            char ch = s1.charAt(i);
            if (counts[ch - 'a']++ == 0) {
                ++distinct;
            }
        }
        int i = 0, j = 0;
        while (j < len2) {
            int jIndex = s2.charAt(j) - 'a';
            if (counts[jIndex] > 0) {
                if (++matchCounts[jIndex] == counts[jIndex]) {
                    ++matchDistinct;
                }
            }
            ++j;
            while (matchDistinct == distinct) {
                if (j - i == len1) {
                    return true;
                }
                int iIndex = s2.charAt(i) - 'a';
                if (counts[iIndex] > 0) {
                    if (--matchCounts[iIndex] < counts[iIndex]) {
                        --matchDistinct;
                    }
                }
                ++i;
            }
        }
        return false;
    }
}
