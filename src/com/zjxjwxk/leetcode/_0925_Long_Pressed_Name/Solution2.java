package com.zjxjwxk.leetcode._0925_Long_Pressed_Name;

/**
 * @author Xinkang Wu
 * @date 2020/10/21 6:42 下午
 */
public class Solution2 {

    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                ++i;
                ++j;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                ++j;
            } else {
                return false;
            }
        }
        return i == name.length();
    }
}
