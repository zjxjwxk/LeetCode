package com.zjxjwxk.leetcode._0344_Reverse_String;

/**
 * @author zjxjwxk
 * @date 2020/10/8 10:37 上午
 */
public class Solution {

    public void reverseString(char[] s) {
        int len = s.length, i = 0, j = len - 1;
        char temp;
        while (i < j) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            ++i;
            --j;
        }
    }
}
