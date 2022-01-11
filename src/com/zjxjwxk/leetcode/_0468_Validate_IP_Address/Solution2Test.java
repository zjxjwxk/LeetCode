package com.zjxjwxk.leetcode._0468_Validate_IP_Address;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void validIPAddress1() {
        String IP = "172.16.254.1";
        String ans = "IPv4";
        assertEquals(ans, solution2.validIPAddress(IP));
    }

    @Test
    void validIPAddress2() {
        String IP = "2001:0db8:85a3:0:0:8A2E:0370:7334";
        String ans = "IPv6";
        assertEquals(ans, solution2.validIPAddress(IP));
    }

    @Test
    void validIPAddress3() {
        String IP = "256.256.256.256";
        String ans = "Neither";
        assertEquals(ans, solution2.validIPAddress(IP));
    }

    @Test
    void validIPAddress4() {
        String IP = "2001:0db8:85a3:0:0:8A2E:0370:7334:";
        String ans = "Neither";
        assertEquals(ans, solution2.validIPAddress(IP));
    }

    @Test
    void validIPAddress5() {
        String IP = "1e1.4.5.6";
        String ans = "Neither";
        assertEquals(ans, solution2.validIPAddress(IP));
    }

    @Test
    void validIPAddress6() {
        String IP = "1.1.1.1.";
        String ans = "Neither";
        assertEquals(ans, solution2.validIPAddress(IP));
    }
}