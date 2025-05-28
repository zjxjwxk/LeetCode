package com.zjxjwxk.leetcode._0438_Find_All_Anagrams_in_a_String;

import java.util.ArrayList;
import java.util.List;

/**
 * 优化的滑动窗口（根据p字母数量差值的绝对值）
 * @author Xinkang Wu
 * @date 2025/5/28 22:35
 */
public class Solution3 {

    public List<Integer> findAnagrams(String s, String p) {
        if (s == null || p == null || s.isEmpty() || p.isEmpty() || p.length() > s.length()) {
            return new ArrayList<>();
        }
        int[] pCountArr = new int[26];
        int[] sCountArr = new int[26];
        List<Integer> ans = new ArrayList<>();
        int pLen = p.length(), diff = 0;
        for (int i = 0; i < pLen; ++i) {
            ++pCountArr[p.charAt(i) - 'a'];
            ++sCountArr[s.charAt(i) - 'a'];
        }
        for (int i = 0; i < 26; ++i) {
            if (pCountArr[i] > 0) {
                diff += Math.abs(pCountArr[i] - sCountArr[i]);
            }
        }
        if (diff == 0) {
            ans.add(0);
        }
        for (int i = 1; i <= s.length() - pLen; ++i) {
            int leftIndex = s.charAt(i - 1) - 'a', rightIndex = s.charAt(i + pLen - 1) - 'a';
            --sCountArr[leftIndex];
            if (pCountArr[leftIndex] > 0) {
                if (sCountArr[leftIndex] >= pCountArr[leftIndex]) {
                    --diff;
                } else {
                    ++diff;
                }
            }
            ++sCountArr[rightIndex];
            if (pCountArr[rightIndex] > 0) {
                if (sCountArr[rightIndex] <= pCountArr[rightIndex]) {
                    --diff;
                } else {
                    ++diff;
                }
            }
            if (diff == 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}
