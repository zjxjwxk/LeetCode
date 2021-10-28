package com.zjxjwxk.leetcode._0301_Remove_Invalid_Parentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯剪枝+跳跃去重
 * @author Xinkang Wu
 * @date 2021/10/27 11:16
 */
public class Solution2 {

    public List<String> removeInvalidParentheses(String s) {
        int leftRemove = 0, rightRemove = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                ++leftRemove;
            } else if (ch == ')') {
                if (leftRemove > 0) {
                    --leftRemove;
                } else {
                    ++rightRemove;
                }
            }
        }
        List<String> ans = new ArrayList<>();
        backtrack(s, 0, ' ', true, 0, 0, leftRemove, rightRemove, ans);
        return ans;
    }

    private void backtrack(String s, int index, char preChar, boolean preRemoved, int leftCount, int rightCount, int leftRemove, int rightRemove, List<String> ans) {
        if (leftRemove == 0 && rightRemove == 0) {
            if (isValid(s)) {
                ans.add(s);
            }
            return;
        }
        if (rightCount > leftCount) {
            return;
        }
        int len = s.length();
        if (leftRemove + rightRemove > len - index) {
            return;
        }
        char ch = s.charAt(index);
        if (ch != preChar || preRemoved) {
            if (ch == '(' && leftRemove > 0) {
                backtrack(s.substring(0, index) + s.substring(index + 1, len), index, ch, true, leftCount, rightCount, leftRemove - 1, rightRemove, ans);
            } else if (ch == ')' && rightRemove > 0) {
                backtrack(s.substring(0, index) + s.substring(index + 1, len), index, ch, true, leftCount, rightCount, leftRemove, rightRemove - 1, ans);
            }
        }
        if (ch == '(') {
            ++leftCount;
        } else if (ch == ')') {
            ++rightCount;
        }
        backtrack(s, index + 1, ch, false, leftCount, rightCount, leftRemove, rightRemove, ans);
    }

    private boolean isValid(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                ++count;
            } else if (ch == ')') {
                if (count > 0) {
                    --count;
                } else {
                    return false;
                }
            }
        }
        return count == 0;
    }
}
