package com.zjxjwxk.leetcode._0150_Evaluate_Reverse_Polish_Notation;

/**
 * 栈
 * @author Xinkang Wu
 * @date 2021/3/20 11:16
 */
public class Solution {

    public int evalRPN(String[] tokens) {
        int len = tokens.length, numIndex = -1;
        int[] numStack = new int[(len + 1) >> 1];
        for (String token : tokens) {
            char ch = token.charAt(0);
            if (token.length() != 1 || (ch >= '0' && ch <= '9')) {
                numStack[++numIndex] = Integer.parseInt(token);
            } else {
                int num2 = numStack[numIndex--];
                int num1 = numStack[numIndex--];
                if (ch == '+') {
                    numStack[++numIndex] = num1 + num2;
                } else if (ch == '-') {
                    numStack[++numIndex] = num1 - num2;
                } else if (ch == '*') {
                    numStack[++numIndex] = num1 * num2;
                } else if (ch == '/') {
                    numStack[++numIndex] = num1 / num2;
                }
            }
        }
        return numStack[numIndex];
    }
}
