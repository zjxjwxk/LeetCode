package com.zjxjwxk.leetcode._0135_Candy;

/**
 * 两次遍历
 * @author Xinkang Wu
 * @date 2020/12/24 11:37
 */
public class Solution {

    public int candy(int[] ratings) {
        int len = ratings.length, ans;
        int[] candy = new int[len];
        candy[0] = 1;
        for (int i = 1; i < len; ++i) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            } else {
                candy[i] = 1;
            }
        }
        ans = candy[len - 1];
        for (int i = len - 2; i >= 0; --i) {
            if (ratings[i] > ratings[i + 1]) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            }
            ans += candy[i];
        }
        return ans;
    }
}
