package com.zjxjwxk.leetcode._0383_Ransom_Note;

/**
 * 字符统计
 * @author Xinkang Wu
 * @date 2021/12/4 12:16
 */
public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        int[] counts = new int[26];
        for (char ch : magazine.toCharArray()) {
            ++counts[ch - 'a'];
        }
        for (char ch : ransomNote.toCharArray()) {
            if (--counts[ch - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
