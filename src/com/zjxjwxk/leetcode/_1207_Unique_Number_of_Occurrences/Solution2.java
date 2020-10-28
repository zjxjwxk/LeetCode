package com.zjxjwxk.leetcode._1207_Unique_Number_of_Occurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Map和Set实现
 * @author Xinkang Wu
 * @date 2020/10/28 6:54 下午
 */
public class Solution2 {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Set<Integer> countSet = new HashSet<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        countSet.addAll(countMap.values());
        return countMap.size() == countSet.size();
    }
}
