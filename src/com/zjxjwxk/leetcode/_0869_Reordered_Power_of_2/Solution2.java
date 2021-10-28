package com.zjxjwxk.leetcode._0869_Reordered_Power_of_2;

import java.util.HashSet;
import java.util.Set;

/**
 * 预处理+哈希表
 * @author Xinkang Wu
 * @date 2021/10/28 11:14
 */
public class Solution2 {

    public boolean reorderedPowerOf2(int n) {
        Set<String> powerOf2DigitsCountsSet = new HashSet<>();
        for (int num = 1; num <= 1e9; num <<= 1) {
            powerOf2DigitsCountsSet.add(countDigits(num));
        }
        return powerOf2DigitsCountsSet.contains(countDigits(n));
    }

    private String countDigits(int num) {
        char[] counts = new char[10];
        while (num != 0) {
            ++counts[num % 10];
            num /= 10;
        }
        return new String(counts);
    }
}
