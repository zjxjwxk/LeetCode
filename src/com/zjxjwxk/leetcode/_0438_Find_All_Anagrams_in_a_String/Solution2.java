package com.zjxjwxk.leetcode._0438_Find_All_Anagrams_in_a_String;

import java.util.ArrayList;
import java.util.List;

/**
 * 优化的滑动窗口（根据数量不同的字母的个数）
 * @author Xinkang Wu
 * @date 2021/11/28 13:31
 */
public class Solution2 {

    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        List<Integer> ans = new ArrayList<>();
        if (sLen < pLen) {
            return ans;
        }
        int[] diff = new int[26];
        int i = 0, j, diffCount = 0;
        for (j = 0; j < pLen; ++j) {
            ++diff[s.charAt(j) - 'a'];
            --diff[p.charAt(j) - 'a'];
        }
        for (int k = 0; k < 26; ++k) {
            if (diff[k] != 0) {
                ++diffCount;
            }
        }
        if (diffCount == 0) {
            ans.add(i);
        }
        while (j < sLen) {
            int iIndex = s.charAt(i++) - 'a', jIndex = s.charAt(j++) - 'a';
            if (diff[iIndex] == 0) {
                ++diffCount;
            } else if (diff[iIndex] == 1) {
                --diffCount;
            }
            --diff[iIndex];
            if (diff[jIndex] == 0) {
                ++diffCount;
            } else if (diff[jIndex] == -1) {
                --diffCount;
            }
            ++diff[jIndex];
            if (diffCount == 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}
