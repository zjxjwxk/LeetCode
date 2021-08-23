package com.zjxjwxk.leetcode._0171_Excel_Sheet_Column_Number;

/**
 * 进制转换
 * @author Xinkang Wu
 * @date 2021/8/23 21:31
 */
public class Solution {

    public int titleToNumber(String columnTitle) {
        int ans = 0;
        char[] chArr = columnTitle.toCharArray();
        for (char ch : chArr) {
            ans = ans * 26 + ch - 'A' + 1;
        }
        return ans;
    }
}
