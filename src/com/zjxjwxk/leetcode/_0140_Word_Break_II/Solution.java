package com.zjxjwxk.leetcode._0140_Word_Break_II;

import java.util.*;

/**
 * @author Xinkang Wu
 * @date 2020/11/1 2:07 下午
 */
public class Solution {

    private Map<Integer, List<List<String>>> map;
    private Set<String> wordSet;
    private String s;
    private int len;

    public List<String> wordBreak(String s, List<String> wordDict) {
        map = new HashMap<>();
        wordSet = new HashSet<>(wordDict);
        this.s = s;
        len = s.length();
        List<List<String>> wordBreaks = dfs(0);
        List<String> ans = new ArrayList<>();
        for (List<String> wordBreak : wordBreaks) {
            ans.add(String.join(" ", wordBreak));
        }
        return ans;
    }

    private List<List<String>> dfs(int index) {
        if (map.containsKey(index)) {
            return map.get(index);
        }
        List<List<String>> wordBreaks = new LinkedList<>();
        if (index == len) {
            wordBreaks.add(new ArrayList<>());
        }
        for (int i = index + 1; i <= len; ++i) {
            String word = s.substring(index, i);
            if (wordSet.contains(word)) {
                List<List<String>> nextWordBreaks = dfs(i);
                for (List<String> nextWordBreak : nextWordBreaks) {
                    LinkedList<String> wordBreak = new LinkedList<>(nextWordBreak);
                    wordBreak.offerFirst(word);
                    wordBreaks.add(wordBreak);
                }
            }
        }
        map.put(index, wordBreaks);
        return wordBreaks;
    }
}
