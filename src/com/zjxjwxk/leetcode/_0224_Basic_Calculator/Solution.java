package com.zjxjwxk.leetcode._0224_Basic_Calculator;

/**
 * 括号展开+栈
 * @author Xinkang Wu
 * @date 2021/3/10 21:36
 */
public class Solution {

    public int calculate(String s) {
        int len = s.length(), sIndex = 0, index = -1, ans = 0, curSign = 1;
        char[] chArr = s.toCharArray();
        int[] signStack = new int[len];
        signStack[++index] = curSign;
        while (sIndex < len) {
            char ch = chArr[sIndex];
            if (ch != ' ') {
                if (ch == '+') {
                    curSign = signStack[index];
                } else if (ch == '-') {
                    curSign = -signStack[index];
                } else if (ch == '(') {
                    signStack[++index] = curSign;
                } else if (ch == ')') {
                    --index;
                } else {
                    int num = 0;
                    while (sIndex < len && chArr[sIndex] >= '0' && chArr[sIndex] <= '9') {
                        num = num * 10 + chArr[sIndex++] - '0';
                    }
                    --sIndex;
                    ans += curSign * num;
                }
            }
            ++sIndex;
        }
        return ans;
    }
}
