package com.zjxjwxk.leetcode._1018_Binary_Prefix_Divisible_By_5;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟
 * @author Xinkang Wu
 * @date 2021/1/14 21:10
 */
public class Solution {

    public List<Boolean> prefixesDivBy5(int[] A) {
        int num = 0;
        List<Boolean> ans = new ArrayList<>();
        for (int a : A) {
            num = (num << 1 ^ a) % 5;
            ans.add(num == 0);
        }
        return ans;
    }
}
