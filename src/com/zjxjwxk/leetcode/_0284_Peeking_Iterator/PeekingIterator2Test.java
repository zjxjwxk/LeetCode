package com.zjxjwxk.leetcode._0284_Peeking_Iterator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PeekingIterator2Test {

    @Test
    void test() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        PeekingIterator2 peekingIterator2 = new PeekingIterator2(list.iterator());
        System.out.println(peekingIterator2.next());
        System.out.println(peekingIterator2.peek());
        System.out.println(peekingIterator2.next());
        System.out.println(peekingIterator2.next());
        System.out.println(peekingIterator2.hasNext());
    }
}