package com.zjxjwxk.leetcode._0135_Candy;

/**
 * 一次遍历+常数空间
 * @author Xinkang Wu
 * @date 2020/12/24 12:01
 */
public class Solution2 {

    public int candy(int[] ratings) {
        int len = ratings.length, downNum = 1, upNum = 1, pre = 1, ans = 1;
        for (int i = 1; i < len; ++i) {
            if (ratings[i] >= ratings[i - 1]) {
                downNum = 0;
                pre = ratings[i] == ratings[i - 1] ? 1 : pre + 1;
                ans += pre;
                upNum = pre;
            } else {
                ++downNum;
                if (downNum == upNum) {
                    ++downNum;
                }
                ans += downNum;
                pre = 1;
            }
        }
        return ans;
    }
}
