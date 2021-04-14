package com.zjxjwxk.leetcode._0208_Implement_Trie__Prefix_Tree__;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Trie2Test {

    @Test
    void test() {
        Trie2 trie2 = new Trie2();
        trie2.insert("apple");
        assertTrue(trie2.search("apple"));
        assertFalse(trie2.search("app"));
        assertTrue(trie2.startsWith("app"));
        trie2.insert("app");
        assertTrue(trie2.search("app"));
    }
}