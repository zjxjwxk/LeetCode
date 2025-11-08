package com.zjxjwxk.leetcode._0077_Combinations;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯 2
 *
 * @author Xinkang Wu
 * @date 2025/11/8 14:45
 */
public class Solution2 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(n, k, 1, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int n, int k, int num, List<Integer> numList, List<List<Integer>> ans) {
        if (numList.size() == k) {
            ans.add(new ArrayList<>(numList));
            return;
        }
        if (numList.size() + (n - num + 1) < k) {
            return;
        }
        numList.add(num);
        backtrack(n, k, num + 1, numList, ans);
        numList.remove(numList.size() - 1);
        backtrack(n, k, num + 1, numList, ans);
    }
}
