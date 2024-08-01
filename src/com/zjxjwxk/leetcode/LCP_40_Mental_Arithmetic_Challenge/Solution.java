package com.zjxjwxk.leetcode.LCP_40_Mental_Arithmetic_Challenge;

import java.util.Arrays;

/**
 * 排序
 * 时间复杂度：O(nlogn)
 * 空间复杂度：O(1)
 * @author Xinkang Wu
 * @date 2024/8/1 23:53
 */
public class Solution {

    public int maxmiumScore(int[] cards, int cnt) {
        Arrays.sort(cards);
        int i, sum = 0, minOdd = -1, minEven = -1, ans = 0;
        for (i = cards.length - 1; i >= cards.length - cnt; --i) {
            int card = cards[i];
            sum += card;
            if ((card & 1) == 1) {
                minOdd = card;
            } else {
                minEven = card;
            }
        }
        if ((sum & 1) == 0) {
            return sum;
        }
        for (int j = i; j >= 0; --j) {
            int card = cards[j];
            if ((card & 1) == 1) {
                if (minEven != -1) {
                    ans = Math.max(ans, sum - minEven + card);
                    break;
                }
            }
        }
        for (int j = i; j >= 0; --j) {
            int card = cards[j];
            if ((card & 1) == 0) {
                if (minOdd != -1) {
                    ans = Math.max(ans, sum - minOdd + card);
                    break;
                }
            }
        }
        return ans;
    }
}
