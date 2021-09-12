package com.zjxjwxk.leetcode._0678_Valid_Parenthesis_String;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 栈
 * @author Xinkang Wu
 * @date 2021/9/12 12:39
 */
public class Solution2 {

    public boolean checkValidString(String s) {
        Deque<Integer> leftStack = new ArrayDeque<>();
        Deque<Integer> asteriskStack = new ArrayDeque<>();
        char[] chArr = s.toCharArray();
        for (int i = 0; i < chArr.length; ++i) {
            if (chArr[i] == '(') {
                leftStack.push(i);
            } else if (chArr[i] == ')') {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                } else if (!asteriskStack.isEmpty()) {
                    asteriskStack.pop();
                } else {
                    return false;
                }
            } else {
                asteriskStack.push(i);
            }
        }
        while (!leftStack.isEmpty() && !asteriskStack.isEmpty()) {
            if (leftStack.pop() > asteriskStack.pop()) {
                return false;
            }
        }
        return leftStack.isEmpty();
    }
}
