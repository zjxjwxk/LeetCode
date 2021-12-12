package com.zjxjwxk.leetcode._0709_To_Lower_Case;

/**
 * 位运算
 * @author Xinkang Wu
 * @date 2021/12/12 14:53
 */
public class Solution2 {

    public String toLowerCase(String s) {
        char[] chArr = s.toCharArray();
        for (int i = 0; i < chArr.length; ++i) {
            char ch = chArr[i];
            if (ch >= 'A' && ch <= 'Z') {
                chArr[i] |= 32;
            }
        }
        return new String(chArr);
    }
}
