package com.zjxjwxk.leetcode._0290_Word_Pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 双哈希表
 * @author Xinkang Wu
 * @date 2020/12/16 09:53
 */
public class Solution {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        String[] patternToStr = new String[26];
        Map<String, Character> strToPattern = new HashMap<>();
        for (int i = 0; i < pattern.length(); ++i) {
            char patternCh = pattern.charAt(i);
            String word = words[i];
            String wordValue = patternToStr[patternCh - 'a'];
            Character patternValue = strToPattern.get(word);
            if (wordValue == null && patternValue == null) {
                patternToStr[patternCh - 'a'] = word;
                strToPattern.put(word, patternCh);
            } else if (wordValue == null || patternValue == null) {
                return false;
            } else {
                if (patternCh != patternValue || !word.equals(wordValue)) {
                    return false;
                }
            }
        }
        return true;
    }
}
