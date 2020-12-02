package com.zjxjwxk.leetcode._0767_Reorganize_String;

/**
 * @author Xinkang Wu
 * @date 2020/12/2 13:26
 */
public class Solution2 {

    public String reorganizeString(String S) {
        int len = S.length(), maxCount = 0;
        int[] counts = new int[26];
        for (int i = 0; i < len; ++i) {
            int index = S.charAt(i) - 'a';
            maxCount = Math.max(maxCount, ++counts[index]);
        }
        if (maxCount > ((len + 1) >> 1)) {
            return "";
        }
        char[] str = new char[len];
        int evenIndex = 0, oddIndex = 1;
        for (int i = 0; i < 26; ++i) {
            while (counts[i] > 0 && counts[i] <= (len >> 1) && oddIndex < len) {
                str[oddIndex] = (char) (i + 'a');
                oddIndex += 2;
                --counts[i];
            }
            while (counts[i] > 0) {
                str[evenIndex] = (char) (i + 'a');
                evenIndex += 2;
                --counts[i];
            }
        }
        return new String(str);
    }
}
