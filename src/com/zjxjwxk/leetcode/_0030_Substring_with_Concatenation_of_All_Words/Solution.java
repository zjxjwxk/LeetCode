package com.zjxjwxk.leetcode._0030_Substring_with_Concatenation_of_All_Words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 滑动窗口
 *
 * @author Xinkang Wu
 * @date 2025/10/20 23:23
 */
public class Solution {

    public List<Integer> findSubstring(String s, String[] words) {
        int n = words.length, wordLen = words[0].length(), strLen = s.length(), subStrLen = n * wordLen;
        List<Integer> ans = new ArrayList<>();
        for (int begin = 0; begin < wordLen && begin + subStrLen <= strLen; ++begin) {
            Map<String, Integer> diffMap = new HashMap<>();
            int i = begin, j;
            for (j = begin; j < begin + subStrLen; j += wordLen) {
                String word = s.substring(j, j + wordLen);
                diffMap.merge(word, 1, Integer::sum);
            }
            for (String word : words) {
                diffMap.put(word, diffMap.getOrDefault(word, 0) - 1);
                if (diffMap.get(word) == 0) {
                    diffMap.remove(word);
                }
            }
            if (diffMap.isEmpty()) {
                ans.add(i);
            }
            while (j + wordLen <= strLen) {
                String lastWord = s.substring(j, j + wordLen);
                diffMap.put(lastWord, diffMap.getOrDefault(lastWord, 0) + 1);
                if (diffMap.get(lastWord) == 0) {
                    diffMap.remove(lastWord);
                }
                String firstWord = s.substring(i, i + wordLen);
                diffMap.put(firstWord, diffMap.getOrDefault(firstWord, 0) - 1);
                if (diffMap.get(firstWord) == 0) {
                    diffMap.remove(firstWord);
                }
                i += wordLen;
                j += wordLen;
                if (diffMap.isEmpty()) {
                    ans.add(i);
                }
            }
        }
        return ans;
    }
}
