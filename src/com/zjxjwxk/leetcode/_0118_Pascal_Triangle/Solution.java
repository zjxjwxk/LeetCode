package com.zjxjwxk.leetcode._0118_Pascal_Triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xinkang Wu
 * @date 2020/12/8 22:08
 */
public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= numRows; ++i) {
            List<Integer> row = new ArrayList<>();
            for (int j = 1; j <= i; ++j) {
                if (j == 1 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> preRow = ans.get(ans.size() - 1);
                    row.add(preRow.get(j - 2) + preRow.get(j - 1));
                }
            }
            ans.add(row);
        }
        return ans;
    }
}
