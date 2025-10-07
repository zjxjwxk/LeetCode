package com.zjxjwxk.leetcode._0058_Length_of_Last_Word;

/**
 * 反向遍历
 *
 * @author zjxjwxk
 */
public class Solution {

    public int lengthOfLastWord(String s) {
        int curLen = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) != ' ') {
                ++curLen;
            } else if (curLen != 0) {
                break;
            }
        }
        return curLen;
    }
}
