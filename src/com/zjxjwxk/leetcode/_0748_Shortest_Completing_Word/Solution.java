package com.zjxjwxk.leetcode._0748_Shortest_Completing_Word;

/**
 * @author Xinkang Wu
 * @date 2021/12/10 14:50
 */
public class Solution {

    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] counts = getCounts(licensePlate);
        int minLen = Integer.MAX_VALUE;
        String ans = null;
        for (String word : words) {
            int[] wordCounts = getCounts(word);
            boolean complete = true;
            for (int i = 0; i < 26; ++i) {
                if (counts[i] > wordCounts[i]) {
                    complete = false;
                    break;
                }
            }
            if (complete && word.length() < minLen) {
                ans = word;
                minLen = word.length();
            }
        }
        return ans;
    }

    private int[] getCounts(String str) {
        int[] counts = new int[26];
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - 'A' + 'a');
            }
            if (ch >= 'a' && ch <= 'z') {
                ++counts[ch - 'a'];
            }
        }
        return counts;
    }
}
