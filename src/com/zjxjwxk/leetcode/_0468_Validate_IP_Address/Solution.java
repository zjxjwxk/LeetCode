package com.zjxjwxk.leetcode._0468_Validate_IP_Address;

/**
 * 使用分治法和内置的 try/catch，将字符串转换成整数处理。
 * 使用 try/catch 不是一种好的方式，因为 try 块中的代码不会被编译器优化，所以最好不要在面试中使用。
 * @author Xinkang Wu
 * @date 2022/1/11 14:53
 */
public class Solution {

    public String validIPAddress(String queryIP) {
        if (validIPv4(queryIP)) {
            return "IPv4";
        }
        if (validIPv6(queryIP)) {
            return "IPv6";
        }
        return "Neither";
    }

    private boolean validIPv4(String queryIP) {
        if (queryIP == null || queryIP.length() == 0 || queryIP.charAt(0) == '.' || queryIP.charAt(queryIP.length() - 1) == '.') {
            return false;
        }
        String[] splits = queryIP.split("\\.");
        if (splits.length != 4) {
            return false;
        }
        for (String str : splits) {
            if (str.length() > 1 && str.charAt(0) == '0') {
                return false;
            }
            try {
                int num = Integer.parseInt(str);
                if (num < 0 || num > 255) {
                    return false;
                }
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    private boolean validIPv6(String queryIP) {
        if (queryIP == null || queryIP.length() == 0) {
            return false;
        }
        if (queryIP.charAt(0) == ':' || queryIP.charAt(queryIP.length() - 1) == ':') {
            return false;
        }
        for (int i = 0; i < queryIP.length(); ++i) {
            if (i > 0 && queryIP.charAt(i) == ':' && queryIP.charAt(i - 1) == ':') {
                return false;
            }
        }
        String[] splits = queryIP.split(":");
        if (splits.length != 8) {
            return false;
        }
        for (String str : splits) {
            if (str.length() > 4) {
                return false;
            }
            try {
                Long.parseLong(str, 16);
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
}
