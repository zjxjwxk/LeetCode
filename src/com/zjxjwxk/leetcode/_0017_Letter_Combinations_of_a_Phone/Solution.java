package com.zjxjwxk.leetcode._0017_Letter_Combinations_of_a_Phone;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xinkang Wu
 * @date 2025/7/29 15:02
 */
public class Solution {

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        char[][] numChars = new char[][]{
                {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'},
                {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}
        };
        List<char[]> numCharList = new ArrayList<>();
        for (int i = 0; i < digits.length(); ++i) {
            char ch = digits.charAt(i);
            numCharList.add(numChars[ch - '2']);
        }
        List<String> ans = new ArrayList<>();
        backtrack(numCharList, 0, new StringBuilder(), ans);
        return ans;
    }

    private void backtrack(List<char[]> numCharList, int index, StringBuilder sb, List<String> ans) {
        if (index == numCharList.size()) {
            ans.add(sb.toString());
            return;
        }
        char[] chars = numCharList.get(index);
        for (char ch : chars) {
            sb.append(ch);
            backtrack(numCharList, index + 1, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
