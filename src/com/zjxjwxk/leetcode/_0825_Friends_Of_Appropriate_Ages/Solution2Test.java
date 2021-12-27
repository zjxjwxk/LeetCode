package com.zjxjwxk.leetcode._0825_Friends_Of_Appropriate_Ages;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void numFriendRequests1() {
        int[] ages = {16, 16};
        int ans = 2;
        assertEquals(ans, solution2.numFriendRequests(ages));
    }

    @Test
    void numFriendRequests2() {
        int[] ages = {16, 17, 18};
        int ans = 2;
        assertEquals(ans, solution2.numFriendRequests(ages));
    }

    @Test
    void numFriendRequests3() {
        int[] ages = {20, 30, 100, 110, 120};
        int ans = 3;
        assertEquals(ans, solution2.numFriendRequests(ages));
    }
}