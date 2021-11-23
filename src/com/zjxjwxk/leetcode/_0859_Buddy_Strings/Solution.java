package com.zjxjwxk.leetcode._0859_Buddy_Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * 枚举
 * @author Xinkang Wu
 * @date 2021/11/23 13:29
 */
public class Solution {

    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            int[] counts = new int[26];
            for (int k = 0; k < s.length(); ++k) {
                if (++counts[s.charAt(k) - 'a'] == 2) {
                    return true;
                }
            }
            return false;
        }
        List<Integer> diff = new ArrayList<>(2);
        for (int k = 0; k < s.length(); ++k) {
            if (s.charAt(k) != goal.charAt(k)) {
                if (diff.size() == 2) {
                    return false;
                }
                diff.add(k);
            }
        }
        if (diff.size() == 2) {
            int index1 = diff.get(0), index2 = diff.get(1);
            return s.charAt(index1) == goal.charAt(index2) && s.charAt(index2) == goal.charAt(index1);
        }
        return false;
    }
}
