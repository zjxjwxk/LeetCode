package com.zjxjwxk.leetcode._0869_Reordered_Power_of_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 回溯+位运算
 * @author Xinkang Wu
 * @date 2021/10/28 11:14
 */
public class Solution {

    public boolean reorderedPowerOf2(int n) {
        List<Integer> digitList = new ArrayList<>();
        while (n != 0) {
            digitList.add(n % 10);
            n /= 10;
        }
        Collections.sort(digitList);
        boolean[] vis = new boolean[digitList.size()];
        return backtrack(digitList, vis, 0, 0);
    }

    private boolean backtrack(List<Integer> digitList, boolean[] vis, int index, int num) {
        int len = digitList.size();
        if (index == len) {
            return (num & (num - 1)) == 0;
        }
        for (int i = 0; i < len; ++i) {
            if (vis[i] || index == 0 && digitList.get(i) == 0 || i > 0 && digitList.get(i).equals(digitList.get(i - 1)) && !vis[i - 1]) {
                continue;
            }
            vis[i] = true;
            if (backtrack(digitList, vis, index + 1, num * 10 + digitList.get(i))) {
                return true;
            }
            vis[i] = false;
        }
        return false;
    }
}
