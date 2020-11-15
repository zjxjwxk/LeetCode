package com.zjxjwxk.leetcode._0402_Remove_K_Digits;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈实现
 * @author Xinkang Wu
 * @date 2020/11/15 15:14
 */
public class Solution {

    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new LinkedList<>();
        int len = num.length();
        for (int i = 0; i < len; ++i) {
            char ch = num.charAt(i);
            while (k > 0 && !stack.isEmpty() && ch < stack.peekLast()) {
                stack.pollLast();
                --k;
            }
            stack.offerLast(ch);
        }
        for (int i = 0; i < k; ++i) {
            stack.pollLast();
        }
        boolean firstZero = true;
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            char ch = stack.pollFirst();
            if (!(ch == '0' && firstZero)) {
                firstZero = false;
                sb.append(ch);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
