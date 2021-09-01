package com.zjxjwxk.leetcode._0165_Compare_Version_Numbers;

/**
 * 双指针
 * @author Xinkang Wu
 * @date 2021/9/1 17:37
 */
public class Solution2 {

    public int compareVersion(String version1, String version2) {
        int i = 0, j = 0, len1 = version1.length(), len2 = version2.length();
        while (i < len1 || j < len2) {
            int num1 = 0, num2 = 0;
            for (; i < len1 && version1.charAt(i) != '.'; ++i) {
                num1 = num1 * 10 + version1.charAt(i) - '0';
            }
            for (; j < len2 && version2.charAt(j) != '.'; ++j) {
                num2 = num2 * 10 + version2.charAt(j) - '0';
            }
            if (num1 != num2) {
                return num1 > num2 ? 1 : -1;
            }
            ++i;
            ++j;
        }
        return 0;
    }
}
