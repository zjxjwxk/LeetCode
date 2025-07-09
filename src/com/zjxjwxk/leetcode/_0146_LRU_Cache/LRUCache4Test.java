package com.zjxjwxk.leetcode._0146_LRU_Cache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LRUCache4Test {

    @Test
    void test() {
        LRUCache4 lruCache4 = new LRUCache4(2);
        lruCache4.put(1, 1);
        lruCache4.put(2, 2);
        assertEquals(1, lruCache4.get(1));
        lruCache4.put(3, 3);
        assertEquals(-1, lruCache4.get(2));
        lruCache4.put(4, 4);
        assertEquals(-1, lruCache4.get(1));
        assertEquals(3, lruCache4.get(3));
        assertEquals(4, lruCache4.get(4));
    }
}