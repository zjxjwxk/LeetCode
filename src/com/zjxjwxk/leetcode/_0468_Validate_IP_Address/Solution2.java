package com.zjxjwxk.leetcode._0468_Validate_IP_Address;

/**
 * 分治（不使用try/catch）
 * @author Xinkang Wu
 * @date 2022/1/11 14:53
 */
public class Solution2 {

    public String validIPAddress(String queryIP) {
        int len = queryIP.length(), dotCount = 0, colonCount = 0;
        for (int i = 0; i < len; ++i) {
            char ch = queryIP.charAt(i);
            if (ch == '.') {
                ++dotCount;
            }
            if (ch == ':') {
                ++colonCount;
            }
        }
        if (dotCount == 3 && validIPv4(queryIP)) {
            return "IPv4";
        }
        if (colonCount == 7 && validIPv6(queryIP)) {
            return "IPv6";
        }
        return "Neither";
    }

    private boolean validIPv4(String queryIP) {
        String[] splits = queryIP.split("\\.", -1);
        for (String str : splits) {
            if (str.length() == 0 || str.length() > 3) {
                return false;
            }
            if (str.length() != 1 && str.charAt(0) == '0') {
                return false;
            }
            for (int i = 0; i < str.length(); ++i) {
                if (!Character.isDigit(str.charAt(i))) {
                    return false;
                }
            }
            if (Integer.parseInt(str) > 255) {
                return false;
            }
        }
        return true;
    }

    private boolean validIPv6(String queryIP) {
        String[] splits = queryIP.split(":", -1);
        String hexDigits = "0123456789abcdefABCDEF";
        for (String str : splits) {
            if (str.length() == 0 || str.length() > 4) {
                return false;
            }
            for (int i = 0; i < str.length(); ++i) {
                if (hexDigits.indexOf(str.charAt(i)) == -1) {
                    return false;
                }
            }
        }
        return true;
    }
}
