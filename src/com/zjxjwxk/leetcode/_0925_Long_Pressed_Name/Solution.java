package com.zjxjwxk.leetcode._0925_Long_Pressed_Name;

/**
 * @author Xinkang Wu
 * @date 2020/10/21 4:27 下午
 */
public class Solution {

    public boolean isLongPressedName(String name, String typed) {
        char ch1, ch2;
        int len1 = name.length(), len2 = typed.length(), i = 0, j = 0, preI = 0, preJ = 0;
        while (i < len1 && j < len2) {
            ch1 = name.charAt(i);
            ch2 = typed.charAt(j);
            while (i < len1 && name.charAt(i) == ch1) {
                ++i;
            }
            while (j < len2 && typed.charAt(j) == ch2) {
                ++j;
            }
            if (ch1 != ch2 || (j - preJ) < (i - preI)) {
                return false;
            }
            preI = i;
            preJ = j;
        }
        return i == len1 && j == len2;
    }
}
