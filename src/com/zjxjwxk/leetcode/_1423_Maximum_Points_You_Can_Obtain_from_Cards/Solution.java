package com.zjxjwxk.leetcode._1423_Maximum_Points_You_Can_Obtain_from_Cards;

/**
 * 滑动窗口
 * @author Xinkang Wu
 * @date 2021/2/6 20:19
 */
public class Solution {

    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length, total = 0, sum = 0;
        for (int i = 0; i < len; ++i) {
            total += cardPoints[i];
            if (i == len - k - 1) {
                sum = total;
            }
        }
        sum = total - sum;
        int ans = sum;
        for (int i = len - k; i < len; ++i) {
            sum -= cardPoints[i];
            sum += cardPoints[i - len + k];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
