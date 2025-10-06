package com.zjxjwxk.leetcode._0012_Integer_to_Roman;

/**
 * 硬编码+模拟
 *
 * @author Xinkang Wu
 * @date 2025/10/6 14:06
 */
public class Solution3 {

    private static final int[] BASES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROMANS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < BASES.length; ++i) {
            int base = BASES[i];
            String roman = ROMANS[i];
            while (num >= base) {
                num -= base;
                sb.append(roman);
            }
            if (num == 0) {
                break;
            }
        }
        return sb.toString();
    }
}
