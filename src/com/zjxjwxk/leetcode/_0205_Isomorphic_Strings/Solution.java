package com.zjxjwxk.leetcode._0205_Isomorphic_Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * 哈希表
 * @author Xinkang Wu
 * @date 2020/12/27 10:38
 */
public class Solution {

    public boolean isIsomorphic(String s, String t) {
        int len1 = s.length(), len2 = t.length();
        if (len1 != len2) {
            return false;
        }
        Map<Character, Character> toMap = new HashMap<>();
        Map<Character, Character> fromMap = new HashMap<>();
        for (int i = 0; i < len1; ++i) {
            char ch1 = s.charAt(i), ch2 = t.charAt(i);
            Character value1 = toMap.get(ch1);
            Character value2 = fromMap.get(ch2);
            if (value1 == null && value2 == null) {
                toMap.put(ch1, ch2);
                fromMap.put(ch2, ch1);
            } else if (value1 == null || value2 == null || value1 != ch2 || value2 != ch1) {
                return false;
            }
        }
        return true;
    }
}
