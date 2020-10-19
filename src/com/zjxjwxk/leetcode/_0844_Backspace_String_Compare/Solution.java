package com.zjxjwxk.leetcode._0844_Backspace_String_Compare;

/**
 * 栈
 * @author Xinkang Wu
 * @date 2020/10/19 9:59 上午
 */
public class Solution {

    public boolean backspaceCompare(String S, String T) {
        char[] stack1 = new char[200], stack2 = new char[200];
        int top1 = pushStr(S, stack1);
        int top2 = pushStr(T, stack2);
        return new String(stack1, 0, top1 + 1).equals(new String(stack2, 0, top2 + 1));
    }

    private int pushStr(String S, char[] stack) {
        int i = 0, top = -1;
        while (i < S.length()) {
            if (S.charAt(i) == '#') {
                if (top != -1) {
                    --top;
                }
            } else {
                stack[++top] = S.charAt(i);
            }
            ++i;
        }
        return top;
    }
}
