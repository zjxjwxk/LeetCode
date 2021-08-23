package com.zjxjwxk.leetcode._1104_Path_In_Zigzag_Labelled_Binary_Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 数学
 * @author Xinkang Wu
 * @date 2021/8/13 00:45
 */
public class Solution {

    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> ans = new ArrayList<>();
        int row = 1, num = 1;
        while (label >= (num << 1)) {
            ++row;
            num <<= 1;
        }
        if ((row & 1) == 0) {
            label = getReverse(label, row);
        }
        while (row != 0) {
            if ((row & 1) == 0) {
                ans.add(getReverse(label, row));
            } else {
                ans.add(label);
            }
            --row;
            label >>= 1;
        }
        Collections.reverse(ans);
        return ans;
    }

    public int getReverse(int label, int row) {
        return (1 << (row - 1)) + (1 << row) - 1 - label;
    }
}
