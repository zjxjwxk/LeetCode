package com.zjxjwxk.leetcode._0173_Binary_Search_Tree_Iterator;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSTIteratorTest {

    @Test
    void test1() {
        BSTIterator bstIterator = new BSTIterator(DSFactory.newTree(new Integer[]{7, 3, 15, null, null, 9, 20}));
        assertEquals(3, bstIterator.next());
        assertEquals(7, bstIterator.next());
        assertTrue(bstIterator.hasNext());
        assertEquals(9, bstIterator.next());
        assertTrue(bstIterator.hasNext());
        assertEquals(15, bstIterator.next());
        assertTrue(bstIterator.hasNext());
        assertEquals(20, bstIterator.next());
        assertFalse(bstIterator.hasNext());
    }

    @Test
    void test2() {
        BSTIterator bstIterator = new BSTIterator(DSFactory.newTree(new Integer[]{3, 1, 4, null, 2}));
        assertTrue(bstIterator.hasNext());
        assertEquals(1, bstIterator.next());
        assertTrue(bstIterator.hasNext());
        assertEquals(2, bstIterator.next());
        assertTrue(bstIterator.hasNext());
        assertEquals(3, bstIterator.next());
        assertTrue(bstIterator.hasNext());
        assertEquals(4, bstIterator.next());
        assertFalse(bstIterator.hasNext());
    }
}