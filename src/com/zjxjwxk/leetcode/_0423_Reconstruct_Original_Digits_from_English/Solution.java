package com.zjxjwxk.leetcode._0423_Reconstruct_Original_Digits_from_English;

/**
 * 依次确定每一个数字的次数
 * @author Xinkang Wu
 * @date 2021/11/24 15:43
 */
public class Solution {

    public String originalDigits(String s) {
        int[] counts = new int[26];
        int[] numCounts = new int[10];
        for (char ch : s.toCharArray()) {
            ++counts[ch - 'a'];
        }
        numCounts[0] = counts['z' - 'a'];
        numCounts[2] = counts['w' - 'a'];
        numCounts[4] = counts['u' - 'a'];
        numCounts[6] = counts['x' - 'a'];
        numCounts[8] = counts['g' - 'a'];
        numCounts[3] = counts['h' - 'a'] - numCounts[8];
        numCounts[5] = counts['f' - 'a'] - numCounts[4];
        numCounts[7] = counts['s' - 'a'] - numCounts[6];
        numCounts[1] = counts['o' - 'a'] - numCounts[0] - numCounts[2] - numCounts[4];
        numCounts[9] = counts['i' - 'a'] - numCounts[5] - numCounts[6] - numCounts[8];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < numCounts[i]; ++j) {
                sb.append(i);
            }
        }
        return sb.toString();
    }
}
