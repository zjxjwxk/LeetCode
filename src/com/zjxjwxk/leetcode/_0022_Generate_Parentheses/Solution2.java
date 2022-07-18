package com.zjxjwxk.leetcode._0022_Generate_Parentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯法2
 * @author Xinkang Wu
 * @date 2022/7/17 21:52
 */
public class Solution2 {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        char[] chArr = new char[n << 1];
        backtrack(chArr, 0, 0, 0, n, ans);
        return ans;
    }

    private void backtrack(char[] chArr, int index, int left, int right, int max, List<String> ans) {
        if (index == chArr.length) {
            ans.add(new String(chArr));
            return;
        }
        // we can use '('
        if (left < max) {
            chArr[index] = '(';
            backtrack(chArr, index + 1, left + 1, right, max, ans);
        }
        // we can use ')'
        if (right < left) {
            chArr[index] = ')';
            backtrack(chArr, index + 1, left, right + 1, max, ans);
        }
    }
}
