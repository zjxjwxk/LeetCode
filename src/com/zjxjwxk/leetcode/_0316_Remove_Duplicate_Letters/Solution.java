package com.zjxjwxk.leetcode._0316_Remove_Duplicate_Letters;

/**
 * 贪心+栈
 * @author Xinkang Wu
 * @date 2020/12/20 21:24
 */
public class Solution {

    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        char[] stack = new char[s.length()];
        int top = -1;
        boolean[] exist = new boolean[26];
        for (int i = 0; i < s.length(); ++i) {
            char cur = s.charAt(i);
            if (!exist[cur - 'a']) {
                while (top != -1 && cur < stack[top] && lastIndex[stack[top] - 'a'] > i) {
                    exist[stack[top--] - 'a'] = false;
                }
                stack[++top] = cur;
                exist[cur - 'a'] = true;
            }
        }
        return new String(stack, 0, top + 1);
    }
}
