package com.zjxjwxk.leetcode._0451_Sort_Characters_By_Frequency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 桶排序
 * @author Xinkang Wu
 * @date 2021/7/3 17:21
 */
public class Solution2 {

    public String frequencySort(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        char[] chArr = s.toCharArray();
        int maxCount = 0;
        for (char ch : chArr) {
            int count = countMap.getOrDefault(ch, 0) + 1;
            countMap.put(ch, count);
            maxCount = Math.max(maxCount, count);
        }
        List<Character>[] bucket = new ArrayList[maxCount + 1];
        for (int i = 0; i <= maxCount; ++i) {
            bucket[i] = new ArrayList<>();
        }
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = maxCount; i >= 1; --i) {
            for (int j = 0; j < bucket[i].size(); ++j) {
                for (int k = 0; k < i; ++k) {
                    sb.append(bucket[i].get(j));
                }
            }
        }
        return sb.toString();
    }
}
