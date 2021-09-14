package com.zjxjwxk.leetcode._0524_Longest_Word_in_Dictionary_through_Deleting;

import java.util.List;

/**
 * 排序 + 双指针
 * @author Xinkang Wu
 * @date 2021/9/14 09:59
 */
public class Solution {

    public String findLongestWord(String s, List<String> dictionary) {
        dictionary.sort((dict1, dict2) -> {
            if (dict1.length() != dict2.length()) {
                return dict2.length() - dict1.length();
            } else {
                return dict1.compareTo(dict2);
            }
        });
        for (String dict : dictionary) {
            int i = 0, j = 0;
            while (i < dict.length() && j < s.length()) {
                if (dict.charAt(i) == s.charAt(j)) {
                    ++i;
                }
                ++j;
                if (i == dict.length()) {
                    return dict;
                }
            }
        }
        return "";
    }
}
