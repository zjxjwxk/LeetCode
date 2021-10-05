package com.zjxjwxk.leetcode._0284_Peeking_Iterator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PeekingIterator2Test {

    @Test
    void test() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        PeekingIterator peekingIterator = new PeekingIterator(list.iterator());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.peek());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.hasNext());
    }
}