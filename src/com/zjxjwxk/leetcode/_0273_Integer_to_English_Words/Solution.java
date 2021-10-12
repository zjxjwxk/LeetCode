package com.zjxjwxk.leetcode._0273_Integer_to_English_Words;

/**
 * 迭代
 * @author Xinkang Wu
 * @date 2021/10/11 17:31
 */
public class Solution {

    private static final String[] UNIT = {" Billion", " Million", " Thousand", ""};
    private static final String HUNDRED = " Hundred";
    private static final String[] DIGIT = {"Zero", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
            " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};
    private static final String[] TEN = {"", "", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};

    public String numberToWords(int num) {
        if (num == 0) {
            return DIGIT[0];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < UNIT.length; ++i) {
            int part = num / (1000000000 / (int) Math.pow(1000, i)) % 1000;
            if (part != 0) {
                sb.append(getPartWord(part)).append(UNIT[i]);
            }
        }
        return sb.substring(1);
    }

    private String getPartWord(int part) {
        int hundred = part / 100;
        int ten = part % 100;
        int digit = part % 10;
        StringBuilder sb = new StringBuilder();
        if (hundred != 0) {
            sb.append(DIGIT[hundred]).append(HUNDRED);
        }
        if (ten >= 10) {
            if (ten <= 19) {
                sb.append(DIGIT[ten]);
            } else {
                sb.append(TEN[ten / 10]);
                if (digit != 0) {
                    sb.append(DIGIT[digit]);
                }
            }
        } else if (digit != 0) {
            sb.append(DIGIT[digit]);
        }
        return sb.toString();
    }
}
