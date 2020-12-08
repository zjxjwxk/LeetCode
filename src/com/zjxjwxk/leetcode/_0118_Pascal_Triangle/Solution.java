package com.zjxjwxk.leetcode._0118_Pascal_Triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xinkang Wu
 * @date 2020/12/8 22:08
 */
public class Solution {

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> firstLayer = new ArrayList<>();
        List<Integer> preLayer = firstLayer;
        firstLayer.add(1);
        ans.add(firstLayer);
        for (int i = 1; i < numRows; ++i) {
            List<Integer> layer = new ArrayList<>();
            layer.add(1);
            for (int j = 0; j < preLayer.size() - 1; ++j) {
                layer.add(preLayer.get(j) + preLayer.get(j + 1));
            }
            layer.add(1);
            ans.add(layer);
            preLayer = layer;
        }
        return ans;
    }
}
