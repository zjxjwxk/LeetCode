package com.zjxjwxk.leetcode._0187_Repeated_DNA_Sequences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 哈希表
 * @author Xinkang Wu
 * @date 2021/10/8 12:11
 */
public class Solution {

    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        char[] chars = s.toCharArray();
        int len = chars.length;
        Set<String> ans = new HashSet<>();
        for (int i = 0; i <= len - 10; ++i) {
            String subStr = new String(chars, i, 10);
            if (set.contains(subStr)) {
                ans.add(subStr);
            } else {
                set.add(subStr);
            }
        }
        return new ArrayList<>(ans);
    }
}
