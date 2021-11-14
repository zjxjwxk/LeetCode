package com.zjxjwxk.leetcode._0677_Map_Sum_Pairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapSum2Test {

    @Test
    void test() {
        MapSum2 mapSum2 = new MapSum2();
        mapSum2.insert("apple", 3);
        assertEquals(3, mapSum2.sum("ap"));
        mapSum2.insert("app", 2);
        assertEquals(5, mapSum2.sum("ap"));
        mapSum2.insert("apple", 2);
        assertEquals(4, mapSum2.sum("ap"));
    }

    @Test
    void test2() {
        MapSum2 mapSum2 = new MapSum2();
        mapSum2.insert("a", 3);
        assertEquals(0, mapSum2.sum("ap"));
        mapSum2.insert("b", 2);
        assertEquals(3, mapSum2.sum("a"));
    }
}