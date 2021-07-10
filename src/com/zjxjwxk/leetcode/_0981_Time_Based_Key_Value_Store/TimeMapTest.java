package com.zjxjwxk.leetcode._0981_Time_Based_Key_Value_Store;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeMapTest {

    @Test
    void test1() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        assertEquals("bar", timeMap.get("foo", 1));
        assertEquals("bar", timeMap.get("foo", 3));
        timeMap.set("foo", "bar2", 4);
        assertEquals("bar2", timeMap.get("foo", 4));
        assertEquals("bar2", timeMap.get("foo", 5));
    }

    @Test
    void test2() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("love", "high", 10);
        timeMap.set("love", "low", 20);
        assertEquals("", timeMap.get("love", 5));
        assertEquals("high", timeMap.get("love", 10));
        assertEquals("high", timeMap.get("love", 15));
        assertEquals("low", timeMap.get("love", 20));
        assertEquals("low", timeMap.get("love", 25));
    }
}