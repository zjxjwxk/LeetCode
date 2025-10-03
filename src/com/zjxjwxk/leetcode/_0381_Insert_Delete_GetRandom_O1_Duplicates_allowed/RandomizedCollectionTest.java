package com.zjxjwxk.leetcode._0381_Insert_Delete_GetRandom_O1_Duplicates_allowed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomizedCollectionTest {

    private final RandomizedCollection collection = new RandomizedCollection();

    @Test
    void test() {
        boolean result = collection.insert(0);
        assertTrue(result);
        result = collection.remove(0);
        assertTrue(result);
        result = collection.insert(-1);
        assertTrue(result);
        result = collection.remove(0);
        assertFalse(result);
    }
}