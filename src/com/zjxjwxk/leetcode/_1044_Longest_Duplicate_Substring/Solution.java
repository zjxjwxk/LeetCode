package com.zjxjwxk.leetcode._1044_Longest_Duplicate_Substring;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 二分查找+Rabin-Karp字符串编码
 * @author Xinkang Wu
 * @date 2021/12/26 23:13
 */
public class Solution {

    public String longestDupSubstring(String s) {
        int n = s.length();
        Random random = new Random();
        int radix1 = random.nextInt(75) + 26;
        int radix2 = random.nextInt(75) + 26;
        int mod1 = random.nextInt(Integer.MAX_VALUE - 1000000007 + 1) + 1000000007;
        int mod2 = random.nextInt(Integer.MAX_VALUE - 1000000007 + 1) + 1000000007;
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = s.charAt(i) - 'a';
        }
        int left = 1, right = s.length() - 1, mid, start = -1, length = 0;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            Set<Long> encodeSet = new HashSet<>();
            long encode1 = 0, encode2 = 0;
            for (int i = 0; i < mid; ++i) {
                encode1 = (encode1 * radix1 % mod1 + arr[i]) % mod1;
                encode2 = (encode2 * radix2 % mod2 + arr[i]) % mod2;
                if (encode1 < 0) {
                    encode1 += mod1;
                }
                if (encode2 < 0) {
                    encode2 += mod2;
                }
            }
            long encode = encode1 * mod2 + encode2;
            encodeSet.add(encode);
            long pow1 = pow(radix1, mid, mod1);
            long pow2 = pow(radix2, mid, mod2);
            boolean duplicate = false;
            for (int i = 1; i <= n - mid; ++i) {
                encode1 = (encode1 * radix1 % mod1 - arr[i - 1] * pow1 % mod1 + arr[i + mid - 1]) % mod1;
                encode2 = (encode2 * radix2 % mod2 - arr[i - 1] * pow2 % mod2 + arr[i + mid - 1]) % mod2;
                if (encode1 < 0) {
                    encode1 += mod1;
                }
                if (encode2 < 0) {
                    encode2 += mod2;
                }
                encode = encode1 * mod2 + encode2;
                if (!encodeSet.add(encode)) {
                    duplicate = true;
                    length = mid;
                    start = i;
                    break;
                }
            }
            if (duplicate) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (start == -1) {
            return "";
        }
        return s.substring(start, start + length);
    }

    private long pow(int a, int x, int mod) {
        long ans = 1;
        long contribute = a;
        while (x != 0) {
            if ((x & 1) == 1) {
                ans = ans * contribute % mod;
                if (ans < 0) {
                    ans += mod;
                }
            }
            contribute = contribute * contribute % mod;
            if (contribute < 0) {
                contribute += mod;
            }
            x >>= 1;
        }
        return ans;
    }
}
