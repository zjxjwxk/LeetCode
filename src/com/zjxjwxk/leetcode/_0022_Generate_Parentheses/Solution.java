package com.zjxjwxk.leetcode._0022_Generate_Parentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯法1
 * @author Xinkang Wu
 * @date 2022/7/17 21:46
 */
public class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        char[] chArr = new char[n << 1];
        backtrack(-1, n, chArr, 0, ans);
        return ans;
    }

    private void backtrack(int top, int n, char[] chArr, int index, List<String> ans) {
        if (index == chArr.length) {
            ans.add(new String(chArr));
            return;
        }
        // we can only push
        if (top == -1) {
            if (n == 0) {
                return;
            }
            chArr[index] = '(';
            backtrack(0, n - 1, chArr, index + 1, ans);
            return;
        }
        // we can only pop
        if (n == 0) {
            chArr[index] = ')';
            backtrack(top - 1, n, chArr, index + 1, ans);
            return;
        }
        // we can either push or pop
        chArr[index] = '(';
        backtrack(top + 1, n - 1, chArr, index + 1, ans);
        chArr[index] = ')';
        backtrack(top - 1, n, chArr, index + 1, ans);
    }
}
