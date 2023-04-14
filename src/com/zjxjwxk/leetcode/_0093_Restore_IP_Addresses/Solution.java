package com.zjxjwxk.leetcode._0093_Restore_IP_Addresses;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Xinkang Wu
 * @date 2023/4/15 01:16
 */
public class Solution {

    public List<String> restoreIpAddresses(String s) {
        List<String> ipAddressList = new ArrayList<>();
        if (s == null || s.length() == 0 || s.length() > 12) {
            return ipAddressList;
        }
        char[] chars = s.toCharArray();
        dfs(ipAddressList, new ArrayList<>(), 0, chars, 0);
        return ipAddressList;
    }

    private void dfs(List<String> ipAddressList, List<Integer> numList, int num, char[] chars, int index) {
        if (index == chars.length) {
            if (numList.size() == 4) {
                String ipAddress = numList.stream().map(String::valueOf).collect(Collectors.joining("."));
                ipAddressList.add(ipAddress);
            }
            return;
        }
        if (numList.size() > 4) {
            return;
        }
        num = num * 10 + chars[index] - '0';
        if (num > 255) {
            return;
        }
        if (num > 0 && index < chars.length - 1) {
            dfs(ipAddressList, numList, num, chars, index + 1);
        }
        numList.add(num);
        dfs(ipAddressList, numList, 0, chars, index + 1);
        numList.remove(numList.size() - 1);
    }
}
