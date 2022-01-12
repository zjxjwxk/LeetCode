package com.zjxjwxk.leetcode._0752_Open_the_Lock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void openLock1() {
        String[] deadends = {"0201", "0101", "0102", "1212", "2002"};
        String target = "0202";
        int ans = 6;
        assertEquals(ans, solution2.openLock(deadends, target));
    }

    @Test
    void openLock2() {
        String[] deadends = {"8888"};
        String target = "0009";
        int ans = 1;
        assertEquals(ans, solution2.openLock(deadends, target));
    }

    @Test
    void openLock3() {
        String[] deadends = {"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"};
        String target = "8888";
        int ans = -1;
        assertEquals(ans, solution2.openLock(deadends, target));
    }

    @Test
    void openLock4() {
        String[] deadends = {"0000"};
        String target = "8888";
        int ans = -1;
        assertEquals(ans, solution2.openLock(deadends, target));
    }
}