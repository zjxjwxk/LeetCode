package com.zjxjwxk.leetcode._0242_Valid_Anagram;

/**
 * 哈希表
 * @author Xinkang Wu
 * @date 2020/11/22 10:28
 */
public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] hashTable = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            ++hashTable[s.charAt(i) - 'a'];
        }
        for (int i = 0; i < t.length(); ++i) {
            int index = t.charAt(i) - 'a';
            if (hashTable[index] == 0) {
                return false;
            } else {
                --hashTable[index];
            }
        }
        return true;
    }
}
