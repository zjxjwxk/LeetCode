package com.zjxjwxk.leetcode._0006_Zigzag_Conversion;

/**
 * 遍历字符归入对应行（由小到大，再由大到小）
 *
 * @author Xinkang Wu
 * @date 2025/10/10 23:04
 */
public class Solution2 {

    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder[] sbArr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; ++i) {
            sbArr[i] = new StringBuilder();
        }
        int i = 0, flag = -1;
        for (char ch : s.toCharArray()) {
            sbArr[i].append(ch);
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i += flag;
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder sb : sbArr) {
            ans.append(sb);
        }
        return ans.toString();
    }
}
