package com.zjxjwxk.leetcode._0290_Word_Pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 单哈希表
 * @author Xinkang Wu
 * @date 2020/12/16 10:52
 */
public class Solution2 {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); ++i) {
            char p = pattern.charAt(i);
            String word = words[i];
            if (!map.containsKey(p)) {
                if (map.containsValue(word)) {
                    return false;
                }
                map.put(p, word);
            } else if (!word.equals(map.get(p))) {
                return false;
            }
        }
        return true;
    }
}
