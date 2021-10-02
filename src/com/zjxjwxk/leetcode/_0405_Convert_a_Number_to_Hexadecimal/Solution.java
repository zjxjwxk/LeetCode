package com.zjxjwxk.leetcode._0405_Convert_a_Number_to_Hexadecimal;

/**
 * 位运算
 * @author Xinkang Wu
 * @date 2021/10/2 22:11
 */
public class Solution {

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 7; i >= 0; --i) {
            int hexDigitNum = (num >> (4 * i)) & 0xf;
            if (sb.length() > 0 || hexDigitNum > 0) {
                char hexDigitCh = (char) (hexDigitNum < 10 ? ('0' + hexDigitNum) : ('a' + hexDigitNum - 10));
                sb.append(hexDigitCh);
            }
        }
        return sb.toString();
    }
}
