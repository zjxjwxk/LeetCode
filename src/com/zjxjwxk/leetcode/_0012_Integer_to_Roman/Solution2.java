package com.zjxjwxk.leetcode._0012_Integer_to_Roman;

import java.util.HashMap;
import java.util.Map;

/**
 * 模拟
 *
 * @author Xinkang Wu
 * @date 2025/10/6 13:56
 */
public class Solution2 {

    private static final Map<Integer, Character> ROMAN_MAP = new HashMap<Integer, Character>(){{
        put(1, 'I');
        put(5, 'V');
        put(10, 'X');
        put(50, 'L');
        put(100, 'C');
        put(500, 'D');
        put(1000, 'M');
    }};

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int base = 1;
        while (base <= num) {
            base *= 10;
        }
        base /= 10;
        while (num > 0) {
            int digit = num / base;
            if (digit >= 1 && digit <= 3) {
                for (int i = 0; i < digit; ++i) {
                    sb.append(ROMAN_MAP.get(base));
                }
            } else if (digit == 4) {
                sb.append(ROMAN_MAP.get(base)).append(ROMAN_MAP.get(base * 5));
            } else if (digit >= 5 && digit <= 8) {
                sb.append(ROMAN_MAP.get(base * 5));
                for (int i = 6; i <= digit; ++i) {
                    sb.append(ROMAN_MAP.get(base));
                }
            } else if (digit == 9) {
                sb.append(ROMAN_MAP.get(base)).append(ROMAN_MAP.get(base * 10));
            }
            num %= base;
            base /= 10;
        }
        return sb.toString();
    }
}
