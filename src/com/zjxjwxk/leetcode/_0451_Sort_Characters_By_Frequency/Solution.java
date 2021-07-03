package com.zjxjwxk.leetcode._0451_Sort_Characters_By_Frequency;

import java.util.*;

/**
 * 按照出现频率排序
 * @author Xinkang Wu
 * @date 2021/7/3 17:21
 */
public class Solution {

    public String frequencySort(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        char[] chArr = s.toCharArray();
        for (char ch : chArr) {
            countMap.merge(ch, 1, Integer::sum);
        }
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(countMap.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());
        StringBuilder sb = new StringBuilder(chArr.length);
        for (Map.Entry<Character, Integer> entry : entryList) {
            for (int i = 0; i < entry.getValue(); ++i) {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
