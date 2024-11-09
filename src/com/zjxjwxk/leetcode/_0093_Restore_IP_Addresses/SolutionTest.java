package com.zjxjwxk.leetcode._0093_Restore_IP_Addresses;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void restoreIpAddresses() {
        String s = "25525511135";
        List<String> ans = Arrays.asList("255.255.11.135", "255.255.111.35");
        assertThat(solution.restoreIpAddresses(s)).containsExactlyInAnyOrderElementsOf(ans);
    }

    @Test
    void restoreIpAddresses2() {
        String s = "0000";
        List<String> ans = Collections.singletonList("0.0.0.0");
        assertThat(solution.restoreIpAddresses(s)).containsExactlyInAnyOrderElementsOf(ans);
    }

    @Test
    void restoreIpAddresses3() {
        String s = "101023";
        List<String> ans = Arrays.asList("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3");
        assertThat(solution.restoreIpAddresses(s)).containsExactlyInAnyOrderElementsOf(ans);
    }
}