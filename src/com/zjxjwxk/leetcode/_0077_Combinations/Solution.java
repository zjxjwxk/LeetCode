package com.zjxjwxk.leetcode._0077_Combinations;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjxjwxk
 * @date 2020/10/13 8:09 下午
 */
public class Solution {

    private final List<List<Integer>> ansList = new ArrayList<>();
    private List<Integer> temp;
    private int n;

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        temp = new ArrayList<>(k);
        dfs(1, k);
        return ansList;
    }

    private void dfs(int i, int k) {
        if (n - i + 1 == k) {
            for (int j = i; j <= n; ++j) {
                temp.add(j);
            }
            ansList.add(new ArrayList<>(temp));
            while (k-- != 0) {
                temp.remove(temp.size() - 1);
            }
            return;
        }
        if (k == 0) {
            ansList.add(new ArrayList<>(temp));
            return;
        }
        temp.add(i);
        dfs(i + 1, k - 1);
        temp.remove(temp.size() - 1);
        dfs(i + 1, k);
    }
}
