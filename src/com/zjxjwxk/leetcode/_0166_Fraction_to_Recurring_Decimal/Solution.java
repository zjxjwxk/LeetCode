package com.zjxjwxk.leetcode._0166_Fraction_to_Recurring_Decimal;

import java.util.HashMap;
import java.util.Map;

/**
 * 长除法
 * @author Xinkang Wu
 * @date 2021/10/3 16:24
 */
public class Solution {

    public String fractionToDecimal(int numerator, int denominator) {
        boolean negative = numerator > 0 && denominator < 0 || numerator < 0 && denominator > 0;
        long numeratorLong = Math.abs((long) numerator);
        long denominatorLong = Math.abs((long) denominator);
        StringBuilder sb = new StringBuilder();
        long integer = numeratorLong / denominatorLong;
        if (negative) {
            sb.append('-');
        }
        sb.append(integer);
        if (numeratorLong % denominatorLong != 0) {
            sb.append('.');
        }
        Map<Long, Integer> modIndexMap = new HashMap<>();
        long mod = numeratorLong % denominatorLong;
        int digit = (int) (mod * 10 / denominatorLong);
        int index = 0;
        StringBuilder decimal = new StringBuilder();
        while (mod != 0 && !modIndexMap.containsKey(mod)) {
            decimal.append(digit);
            modIndexMap.put(mod, index++);
            mod = mod * 10 % denominatorLong;
            digit = (int) (mod * 10 / denominatorLong);
        }
        if (mod != 0) {
            decimal.insert(modIndexMap.get(mod).intValue(), '(');
            decimal.append(')');
        }
        sb.append(decimal);
        return sb.toString();
    }
}
