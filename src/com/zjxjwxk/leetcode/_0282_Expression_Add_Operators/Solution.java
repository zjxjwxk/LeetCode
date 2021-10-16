package com.zjxjwxk.leetcode._0282_Expression_Add_Operators;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯
 * @author Xinkang Wu
 * @date 2021/10/16 15:58
 */
public class Solution {

    public List<String> addOperators(String num, int target) {
        char[] str = num.toCharArray();
        char[] newStr = new char[19];
        List<String> ans = new ArrayList<>();
        backtrack(str, 0, newStr, 0, 0, 0, target, ans);
        return ans;
    }

    private void backtrack(char[] str, int index, char[] newStr,
                           int newIndex, long result, long mul,
                           int target, List<String> ans) {
        if (index == str.length) {
            if (result == target) {
                ans.add(new String(newStr, 0, newIndex));
            }
            return;
        }
        long num = 0;
        for (int end = index; end < str.length; ++end) {
            num = num * 10 + str[end] - '0';
            if (index == 0) {
                System.arraycopy(str, index, newStr, newIndex, end - index + 1);
                backtrack(str, end + 1, newStr, newIndex + end - index + 1, num, num, target, ans);
            } else {
                System.arraycopy(str, index, newStr, newIndex + 1, end - index + 1);
                newStr[newIndex] = '+';
                backtrack(str, end + 1, newStr, newIndex + end - index + 2, result + num, num, target, ans);
                newStr[newIndex] = '-';
                backtrack(str, end + 1, newStr, newIndex + end - index + 2, result - num, -num, target, ans);
                newStr[newIndex] = '*';
                backtrack(str, end + 1, newStr, newIndex + end - index + 2, result - mul + mul * num, mul * num, target, ans);
            }
            if (str[index] == '0') {
                break;
            }
        }
    }
}
