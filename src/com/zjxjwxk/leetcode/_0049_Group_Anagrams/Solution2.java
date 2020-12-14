package com.zjxjwxk.leetcode._0049_Group_Anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 计数
 * @author Xinkang Wu
 * @date 2020/12/14 11:46
 */
public class Solution2 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            int[] counts = new int[26];
            for (char ch : chars) {
                ++counts[ch - 'a'];
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; ++i) {
                if (counts[i] != 0) {
                    sb.append((char) i + 'a');
                    sb.append(counts[i]);
                }
            }
            String key = sb.toString();
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
