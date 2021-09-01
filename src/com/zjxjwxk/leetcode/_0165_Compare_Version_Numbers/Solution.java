package com.zjxjwxk.leetcode._0165_Compare_Version_Numbers;

/**
 * 字符串分割
 * @author Xinkang Wu
 * @date 2021/9/1 17:37
 */
public class Solution {

    public int compareVersion(String version1, String version2) {
        String[] strArr1 = version1.split("\\.");
        String[] strArr2 = version2.split("\\.");
        for (int i = 0; i < strArr1.length || i < strArr2.length; ++i) {
            Integer num1 = i < strArr1.length ? Integer.parseInt(strArr1[i]) : 0;
            Integer num2 = i < strArr2.length ? Integer.parseInt(strArr2[i]) : 0;
            if (!num1.equals(num2)) {
                return num1.compareTo(num2);
            }
        }
        return 0;
    }
}
