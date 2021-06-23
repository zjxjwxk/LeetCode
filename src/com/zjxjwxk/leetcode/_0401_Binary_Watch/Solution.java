package com.zjxjwxk.leetcode._0401_Binary_Watch;

import java.util.ArrayList;
import java.util.List;

/**
 * 枚举时分
 * @author Xinkang Wu
 * @date 2021/6/23 13:08
 */
public class Solution {

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i <= 11; ++i) {
            for (int j = 0; j <= 59; ++j) {
                if ((Integer.bitCount(i) + Integer.bitCount(j)) == turnedOn) {
                    ans.add(i + ":" + (j < 10 ? "0" : "") + j);
                }
            }
        }
        return ans;
    }
}
