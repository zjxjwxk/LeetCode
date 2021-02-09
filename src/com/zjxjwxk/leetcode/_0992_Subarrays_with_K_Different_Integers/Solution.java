package com.zjxjwxk.leetcode._0992_Subarrays_with_K_Different_Integers;

/**
 * 滑动窗口
 * @author Xinkang Wu
 * @date 2021/2/9 16:17
 */
public class Solution {

    public int subarraysWithKDistinct(int[] A, int K) {
        return subarraysAtMostKDistinct(A, K) - subarraysAtMostKDistinct(A, K - 1);
    }

    public int subarraysAtMostKDistinct(int[] A, int K) {
        int len = A.length, i = 0, j = 0, distinct = 0, ans = 0;
        int[] counts = new int[len + 1];
        while (j < len) {
            if (counts[A[j]]++ == 0) {
                ++distinct;
                while (distinct > K) {
                    if (--counts[A[i++]] == 0) {
                        --distinct;
                    }
                }
            }
            ++j;
            ans += j - i;
        }
        return ans;
    }
}
