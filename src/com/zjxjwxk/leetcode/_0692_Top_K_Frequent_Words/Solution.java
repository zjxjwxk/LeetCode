package com.zjxjwxk.leetcode._0692_Top_K_Frequent_Words;

import java.util.*;

/**
 * 哈希表+排序
 * @author Xinkang Wu
 * @date 2021/5/20 21:38
 */
public class Solution {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            countMap.merge(word, 1, Integer::sum);
        }
        List<String> wordList = new ArrayList<>(countMap.keySet());
        wordList.sort((word1, word2) -> {
            Integer count1 = countMap.get(word1);
            Integer count2 = countMap.get(word2);
            if (!count1.equals(count2)) {
                return count2 - count1;
            } else {
                return word1.compareTo(word2);
            }
        });
        return wordList.subList(0, k);
    }
}
