package com.zjxjwxk.leetcode._0520_Detect_Capital;

/**
 * @author Xinkang Wu
 * @date 2021/11/13 00:29
 */
public class Solution {

    public boolean detectCapitalUse(String word) {
        char[] chArr = word.toCharArray();
        for (int i = 2; i < chArr.length; ++i) {
            if (Character.isLowerCase(chArr[i]) ^ Character.isLowerCase(chArr[1])) {
                return false;
            }
        }
        return !(chArr.length >= 2 && Character.isLowerCase(chArr[0]) && Character.isUpperCase(chArr[1]));
    }
}
