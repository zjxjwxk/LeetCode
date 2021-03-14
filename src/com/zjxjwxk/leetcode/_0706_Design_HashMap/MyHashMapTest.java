package com.zjxjwxk.leetcode._0706_Design_HashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashMapTest {

    @Test
    void test() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        assertEquals(1, myHashMap.get(1));
        assertEquals(-1, myHashMap.get(3));
        myHashMap.put(2, 1);
        assertEquals(1, myHashMap.get(2));
        myHashMap.remove(2);
        assertEquals(-1, myHashMap.get(2));
    }
}