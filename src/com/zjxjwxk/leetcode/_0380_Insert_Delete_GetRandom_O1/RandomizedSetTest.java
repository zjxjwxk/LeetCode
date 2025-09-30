package com.zjxjwxk.leetcode._0380_Insert_Delete_GetRandom_O1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomizedSetTest {

    @Test
    void insert() {
        RandomizedSet randomizedSet = new RandomizedSet();
        boolean result = randomizedSet.insert(1);
        assertTrue(result);
        result = randomizedSet.remove(2);
        assertFalse(result);
        result = randomizedSet.insert(2);
        assertTrue(result);
        result = randomizedSet.remove(1);
        assertTrue(result);
        result = randomizedSet.insert(2);
        assertFalse(result);
    }
}