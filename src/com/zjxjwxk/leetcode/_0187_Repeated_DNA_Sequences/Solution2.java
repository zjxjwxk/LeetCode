package com.zjxjwxk.leetcode._0187_Repeated_DNA_Sequences;

import java.util.*;

/**
 * 哈希表+滑动窗口+位运算
 * @author Xinkang Wu
 * @date 2021/10/8 12:11
 */
public class Solution2 {

    private static final int L = 10;

    public List<String> findRepeatedDnaSequences(String s) {
        Map<Character, Integer> binaryMap = new HashMap<Character, Integer>(){{
            put('A', 0);
            put('T', 1);
            put('C', 2);
            put('G', 3);
        }};
        Set<Integer> set = new HashSet<>();
        char[] chars = s.toCharArray();
        int len = chars.length;
        Set<String> ans = new HashSet<>();
        if (len < L) {
            return new ArrayList<>(ans);
        }
        int subStrInt = 0;
        for (int i = 0; i < L - 1; ++i) {
            subStrInt = (subStrInt << 2) | binaryMap.get(chars[i]);
        }
        for (int i = 9; i < len; ++i) {
            subStrInt = ((subStrInt << 2) | binaryMap.get(chars[i])) & ((1 << (L * 2)) - 1);
            if (set.contains(subStrInt)) {
                ans.add(new String(chars, i - 9, L));
            } else {
                set.add(subStrInt);
            }
        }
        return new ArrayList<>(ans);
    }
}
