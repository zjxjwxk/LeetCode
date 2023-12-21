package com.zjxjwxk.leetcode._0146_LRU_Cache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LRUCache3Test {

    @Test
    void test() {
        LRUCache3 lruCache3 = new LRUCache3(2);
        lruCache3.put(1, 1);
        lruCache3.put(2, 2);
        assertEquals(1, lruCache3.get(1));
        lruCache3.put(3, 3);
        assertEquals(-1, lruCache3.get(2));
        lruCache3.put(4, 4);
        assertEquals(-1, lruCache3.get(1));
        assertEquals(3, lruCache3.get(3));
        assertEquals(4, lruCache3.get(4));
    }
}