package com.zjxjwxk.leetcode._0146_LRU_Cache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCache2Test {

    @Test
    void test() {
        LRUCache2 lruCache2 = new LRUCache2(2);
        lruCache2.put(1, 1);
        lruCache2.put(2, 2);
        assertEquals(1, lruCache2.get(1));
        lruCache2.put(3, 3);
        assertEquals(-1, lruCache2.get(2));
        lruCache2.put(4, 4);
        assertEquals(-1, lruCache2.get(1));
        assertEquals(3, lruCache2.get(3));
        assertEquals(4, lruCache2.get(4));
    }
}