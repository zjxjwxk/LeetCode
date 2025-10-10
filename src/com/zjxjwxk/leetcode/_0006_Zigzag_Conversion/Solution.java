package com.zjxjwxk.leetcode._0006_Zigzag_Conversion;

/**
 * 遍历字符归入对应行（直接计算行下标）
 *
 * @author Xinkang Wu
 * @date 2025/10/10 23:04
 */
public class Solution {

    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder[] sbArr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; ++i) {
            sbArr[i] = new StringBuilder();
        }
        int mod = (numRows - 1) << 1, mid = mod >> 1;
        for (int i = 0; i < s.length(); ++i) {
            int remain = i % mod;
            if (remain > mid) {
                remain = mid - (remain - mid);
            }
            sbArr[remain].append(s.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder sb : sbArr) {
            ans.append(sb);
        }
        return ans.toString();
    }
}
