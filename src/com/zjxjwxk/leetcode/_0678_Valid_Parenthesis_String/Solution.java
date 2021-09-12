package com.zjxjwxk.leetcode._0678_Valid_Parenthesis_String;

/**
 * 贪心
 * @author Xinkang Wu
 * @date 2021/9/12 12:39
 */
public class Solution {

    public boolean checkValidString(String s) {
        int leftMin = 0, leftMax = 0;
        char[] chArr = s.toCharArray();
        for (char ch : chArr) {
            if (ch == '(') {
                ++leftMin;
                ++leftMax;
            } else if (ch == ')') {
                leftMin = Math.max(leftMin - 1, 0);
                if (--leftMax < 0) {
                    return false;
                }
            } else {
                leftMin = Math.max(leftMin - 1, 0);
                ++leftMax;
            }
        }
        return leftMin == 0;
    }
}
