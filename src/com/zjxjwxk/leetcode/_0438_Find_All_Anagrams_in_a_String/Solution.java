package com.zjxjwxk.leetcode._0438_Find_All_Anagrams_in_a_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 滑动窗口
 * @author Xinkang Wu
 * @date 2021/11/28 13:31
 */
public class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        List<Integer> ans = new ArrayList<>();
        if (sLen < pLen) {
            return ans;
        }
        int[] pCounts = new int[26], sCounts = new int[26];
        int i = 0, j;
        for (j = 0; j < pLen; ++j) {
            ++sCounts[s.charAt(j) - 'a'];
            ++pCounts[p.charAt(j) - 'a'];
        }
        if (Arrays.equals(sCounts, pCounts)) {
            ans.add(i);
        }
        while (j < sLen) {
            --sCounts[s.charAt(i++) -'a'];
            ++sCounts[s.charAt(j++) - 'a'];
            if (Arrays.equals(sCounts, pCounts)) {
                ans.add(i);
            }
        }
        return ans;
    }
}
