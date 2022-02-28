package com.zjxjwxk.leetcode._0077_Combinations;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjxjwxk
 * @date 2020/10/13 8:09 下午
 */
public class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(1, n, k, new ArrayList<>(), ans);
        return ans;
    }

    public void dfs(int index, int n, int k, List<Integer> list, List<List<Integer>> ans) {
        if (list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i <= n && i <= n - k + 1 + list.size(); ++i) {
            list.add(i);
            dfs(i + 1, n, k, list, ans);
            list.remove(list.size() - 1);
        }
    }
}
