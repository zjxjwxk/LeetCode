package com.zjxjwxk.leetcode.LCP_40_Mental_Arithmetic_Challenge;

/**
 * 哈希
 * 时间复杂度：O(n)
 * 空间复杂度：O(C), C=1000
 * @author Xinkang Wu
 * @date 2024/8/2 00:17
 */
public class Solution2 {

    public int maxmiumScore(int[] cards, int cnt) {
        int[] cardCounts = new int[1001];
        for (int card : cards) {
            ++cardCounts[card];
        }
        int i, sum = 0, minOdd = -1, minEven = -1, ans = 0;
        for (i = 1000; i >= 0 && cnt >= 0; --i) {
            int cardCount = cardCounts[i];
            if (cardCount == 0) {
                continue;
            }
            if ((i & 1) == 1) {
                minOdd = i;
            } else {
                minEven = i;
            }
            if (cardCount <= cnt) {
                sum += cardCount * i;
                cnt -= cardCount;
            } else {
                cardCounts[i] -= cnt;
                sum += cnt * i;
                cnt = 0;
                break;
            }
        }
        if ((sum & 1) == 0) {
            return sum;
        }
        for (int j = i; j >= 1; --j) {
            if (cardCounts[j] == 0) {
                continue;
            }
            if ((j & 1) == 1) {
                if (minEven != -1) {
                    ans = Math.max(ans, sum - minEven + j);
                    break;
                }
            }
        }
        for (int j = i; j >= 1; --j) {
            if (cardCounts[j] == 0) {
                continue;
            }
            if ((j & 1) == 0) {
                if (minOdd != -1) {
                    ans = Math.max(ans, sum - minOdd + j);
                    break;
                }
            }
        }
        return ans;
    }
}
