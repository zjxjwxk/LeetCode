package com.zjxjwxk.leetcode._0119_Pascal_s_Triangle_II;

import java.util.ArrayList;
import java.util.List;

/**
 * 原地递推
 * @author Xinkang Wu
 * @date 2021/2/12 20:25
 */
public class Solution {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= rowIndex; ++i) {
            row.add(0);
            for (int j = i; j > 0; --j) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }
}
