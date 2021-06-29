package com.zjxjwxk.leetcode._0168_Excel_Sheet_Column_Title;

/**
 * 数学
 * @author Xinkang Wu
 * @date 2021/6/29 22:52
 */
public class Solution {

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber != 0) {
            sb.append((char) ('A' + (columnNumber - 1) % 26));
            columnNumber = (columnNumber - 1) / 26;
        }
        return sb.reverse().toString();
    }
}
