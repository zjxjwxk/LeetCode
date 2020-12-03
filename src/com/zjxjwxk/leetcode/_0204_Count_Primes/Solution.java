package com.zjxjwxk.leetcode._0204_Count_Primes;

/**
 * 枚举
 * @author Xinkang Wu
 * @date 2020/12/3 00:24
 */
public class Solution {

    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrime(i)) {
                ++count;
            }
        }
        return count;
    }

    private boolean isPrime(int num) {
        for (int i = 2; i * i <= num; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
