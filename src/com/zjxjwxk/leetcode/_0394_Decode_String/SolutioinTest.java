package com.zjxjwxk.leetcode._0394_Decode_String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutioinTest {

    private final Solutioin solutioin = new Solutioin();

    @Test
    void decodeString() {
        String s = "3[a]2[bc]";
        String ans = "aaabcbc";
        assertEquals(ans, solutioin.decodeString(s));
    }

    @Test
    void decodeString2() {
        String s = "3[a2[c]]";
        String ans = "accaccacc";
        assertEquals(ans, solutioin.decodeString(s));
    }

    @Test
    void decodeString3() {
        String s = "2[abc]3[cd]ef";
        String ans = "abcabccdcdcdef";
        assertEquals(ans, solutioin.decodeString(s));
    }

    @Test
    void decodeString4() {
        String s = "abc3[cd]xyz";
        String ans = "abccdcdcdxyz";
        assertEquals(ans, solutioin.decodeString(s));
    }
}