package com.zjxjwxk.leetcode._0676_Implement_Magic_Dictionary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicDictionaryTest {

    private MagicDictionary magicDictionary;

    @Test
    void search() {
        this.magicDictionary = new MagicDictionary();
        String[] dictionary = {"hello", "leetcode"};
        magicDictionary.buildDict(dictionary);
        assertFalse(magicDictionary.search("hello"));
        assertTrue(magicDictionary.search("hhllo"));
        assertFalse(magicDictionary.search("hell"));
        assertFalse(magicDictionary.search("leetcoded"));
    }

    @Test
    void search2() {
        this.magicDictionary = new MagicDictionary();
        String[] dictionary = {"hello", "hallo", "leetcode"};
        magicDictionary.buildDict(dictionary);
        assertTrue(magicDictionary.search("hello"));
        assertTrue(magicDictionary.search("hhllo"));
        assertFalse(magicDictionary.search("hell"));
        assertFalse(magicDictionary.search("leetcoded"));
    }
}