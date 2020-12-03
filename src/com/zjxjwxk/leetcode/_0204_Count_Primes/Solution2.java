package com.zjxjwxk.leetcode._0204_Count_Primes;

/**
 * 埃氏筛
 * @author Xinkang Wu
 * @date 2020/12/3 00:49
 */
public class Solution2 {

    public int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; ++i) {
            if (!notPrimes[i]) {
                ++count;
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        notPrimes[j] = true;
                    }
                }
            }
        }
        return count;
    }
}
