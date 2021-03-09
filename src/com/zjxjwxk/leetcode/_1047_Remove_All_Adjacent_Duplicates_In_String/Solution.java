package com.zjxjwxk.leetcode._1047_Remove_All_Adjacent_Duplicates_In_String;

/**
 * 栈
 * @author Xinkang Wu
 * @date 2021/3/9 21:24
 */
public class Solution {

    public String removeDuplicates(String S) {
        int len = S.length(), index = -1;
        char[] stack = new char[len];
        for (char ch : S.toCharArray()) {
            if (index >= 0 && ch == stack[index]) {
                --index;
            } else {
                stack[++index] = ch;
            }
        }
        return new String(stack, 0, index + 1);
    }
}
