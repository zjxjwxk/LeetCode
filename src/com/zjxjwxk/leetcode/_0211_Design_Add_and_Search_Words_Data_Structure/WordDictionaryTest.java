package com.zjxjwxk.leetcode._0211_Design_Add_and_Search_Words_Data_Structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryTest {

    @Test
    void test1() {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assertFalse(wordDictionary.search("pad"));
        assertTrue(wordDictionary.search("bad"));
        assertTrue(wordDictionary.search(".ad"));
        assertTrue(wordDictionary.search("b.."));
    }

    @Test
    void test2() {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("at");
        wordDictionary.addWord("and");
        wordDictionary.addWord("an");
        wordDictionary.addWord("add");
        assertFalse(wordDictionary.search("a"));
        assertFalse(wordDictionary.search(".at"));
        wordDictionary.addWord("bat");
        assertTrue(wordDictionary.search(".at"));
        assertTrue(wordDictionary.search("an."));
        assertFalse(wordDictionary.search("a.d."));
        assertFalse(wordDictionary.search("b."));
        assertTrue(wordDictionary.search("a.d"));
        assertFalse(wordDictionary.search("."));
    }
}