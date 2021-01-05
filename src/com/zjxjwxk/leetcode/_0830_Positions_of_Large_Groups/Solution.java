package com.zjxjwxk.leetcode._0830_Positions_of_Large_Groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 一次遍历
 * @author Xinkang Wu
 * @date 2021/1/5 21:52
 */
public class Solution {

    public List<List<Integer>> largeGroupPositions(String s) {
        int len = s.length(), start = 0, end = 0;
        char preCh = s.charAt(0);
        List<List<Integer>> ansList = new ArrayList<>();
        for (int i = 1; i < len; ++i) {
            char curCh = s.charAt(i);
            if (curCh == preCh) {
                end = i;
            }
            if (curCh != preCh || i == len - 1){
                if (end - start >= 2) {
                    ansList.add(Arrays.asList(start, end));
                }
                start = i;
            }
            preCh = curCh;
        }
        return ansList;
    }
}
