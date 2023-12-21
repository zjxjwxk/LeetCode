package com.zjxjwxk.leetcode._0146_LRU_Cache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LRUCacheTest {

    @Test
    void test() {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        assertEquals(1, lruCache.get(1));
        lruCache.put(3, 3);
        assertEquals(-1, lruCache.get(2));
        lruCache.put(4, 4);
        assertEquals(-1, lruCache.get(1));
        assertEquals(3, lruCache.get(3));
        assertEquals(4, lruCache.get(4));
    }
}