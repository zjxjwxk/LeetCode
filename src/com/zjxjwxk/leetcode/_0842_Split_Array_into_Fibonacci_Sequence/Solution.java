package com.zjxjwxk.leetcode._0842_Split_Array_into_Fibonacci_Sequence;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯剪枝
 * @author Xinkang Wu
 * @date 2020/12/9 10:10
 */
public class Solution {

    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> ans = new ArrayList<>();
        dfs(S, ans, 0, 0, 0);
        return ans;
    }

    private boolean dfs(String S, List<Integer> ans, int index, int sum, int pre) {
        if (index == S.length()) {
            return ans.size() >= 3;
        }
        long curLong = 0;
        for (int i = index; i < S.length(); ++i) {
            if (i > index && S.charAt(index) == '0') {
                break;
            }
            curLong = curLong * 10 + S.charAt(i) - '0';
            if (curLong > Integer.MAX_VALUE) {
                break;
            }
            int cur = (int) curLong;
            if (ans.size() >= 2) {
                if (cur < sum) {
                    continue;
                }
                if (cur > sum) {
                    break;
                }
            }
            ans.add(cur);
            if (dfs(S, ans, i + 1, pre + cur, cur)) {
                return true;
            } else {
                ans.remove(ans.size() - 1);
            }
        }
        return false;
    }
}
