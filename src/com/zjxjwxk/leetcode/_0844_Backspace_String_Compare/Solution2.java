package com.zjxjwxk.leetcode._0844_Backspace_String_Compare;

/**
 * 双指针
 * @author Xinkang Wu
 * @date 2020/10/19 10:41 上午
 */
public class Solution2 {

    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1, skip1 = 0, skip2 = 0;
        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (S.charAt(i) == '#') {
                    ++skip1;
                } else if (skip1 > 0) {
                    --skip1;
                } else {
                    break;
                }
                --i;
            }
            while (j >= 0) {
                if (T.charAt(j) == '#') {
                    ++skip2;
                } else if (skip2 > 0) {
                    --skip2;
                } else {
                    break;
                }
                --j;
            }
            if (i >= 0 && j >= 0) {
                if (S.charAt(i) != T.charAt(j)) {
                    return false;
                }
            } else if (i >= 0 || j >= 0) {
                return false;
            }
            --i;
            --j;
        }
        return true;
    }
}
