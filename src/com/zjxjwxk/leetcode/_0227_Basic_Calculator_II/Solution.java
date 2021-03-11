package com.zjxjwxk.leetcode._0227_Basic_Calculator_II;

/**
 * 栈
 * @author Xinkang Wu
 * @date 2021/3/11 09:52
 */
public class Solution {

    public int calculate(String s) {
        int len = s.length(), index = -1, sIndex = 0, ans = 0;
        int[] stack = new int[len];
        char[] chArr = s.toCharArray();
        char preSign = '+';
        while (sIndex < len) {
            char ch = chArr[sIndex];
            if (ch != ' ') {
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    preSign = ch;
                } else {
                    int num = 0;
                    while (sIndex < len && chArr[sIndex] >= '0' && chArr[sIndex] <= '9') {
                        num = num * 10 + chArr[sIndex++] - '0';
                    }
                    --sIndex;
                    if (preSign == '*') {
                        stack[index] *= num;
                    } else if (preSign == '/') {
                        stack[index] /= num;
                    } else if (preSign == '-') {
                        stack[++index] = -num;
                    } else {
                        stack[++index] = num;
                    }
                }
            }
            ++sIndex;
        }
        for (int i = 0; i <= index; ++i) {
            ans += stack[i];
        }
        return ans;
    }
}
