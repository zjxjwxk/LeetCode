package com.zjxjwxk.leetcode._0860_Lemonade_Change;

/**
 * 模拟+贪心
 * @author Xinkang Wu
 * @date 2020/12/10 09:53
 */
public class Solution {

    public boolean lemonadeChange(int[] bills) {
        int[] counts = new int[2];
        for (int bill : bills) {
            if (bill == 5) {
                ++counts[0];
            } else if (bill == 10) {
                if (counts[0] >= 1) {
                    --counts[0];
                    ++counts[1];
                } else {
                    return false;
                }
            } else {
                if (counts[1] >= 1 && counts[0] >= 1) {
                    --counts[0];
                    --counts[1];
                } else if (counts[0] >= 3) {
                    counts[0] -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
