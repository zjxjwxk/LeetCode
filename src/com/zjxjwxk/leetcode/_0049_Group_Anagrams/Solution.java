package com.zjxjwxk.leetcode._0049_Group_Anagrams;

import java.util.*;

/**
 * 排序
 * @author Xinkang Wu
 * @date 2020/12/14 00:11
 */
public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
