package com.zjxjwxk.leetcode._0341_Flatten_Nested_List_Iterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NestedIteratorTest {

    @Test
    void test1() {
        NestedIntegerImpl nestedInteger1 = new NestedIntegerImpl(Arrays.asList(new NestedIntegerImpl(1), new NestedIntegerImpl(1)));
        NestedIntegerImpl nestedInteger2 = new NestedIntegerImpl(2);
        NestedIntegerImpl nestedInteger3 = new NestedIntegerImpl(Arrays.asList(new NestedIntegerImpl(1), new NestedIntegerImpl(1)));
        List<Integer> ans = Arrays.asList(1, 1, 2, 1, 1);
        List<Integer> actual = new ArrayList<>();
        NestedIterator nestedIterator = new NestedIterator(Arrays.asList(nestedInteger1, nestedInteger2, nestedInteger3));
        while (nestedIterator.hasNext()) {
            actual.add(nestedIterator.next());
        }
        assertEquals(ans, actual);
    }

    @Test
    void test2() {
        List<Integer> ans = new ArrayList<>();
        List<Integer> actual = new ArrayList<>();
        NestedIterator nestedIterator = new NestedIterator(new ArrayList<>());
        while (nestedIterator.hasNext()) {
            actual.add(nestedIterator.next());
        }
        assertEquals(ans, actual);
    }

    @Test
    void test3() {
        NestedIntegerImpl nestedInteger1 = new NestedIntegerImpl(new ArrayList<>());
        List<Integer> ans = new ArrayList<>();
        List<Integer> actual = new ArrayList<>();
        NestedIterator nestedIterator = new NestedIterator(Collections.singletonList(nestedInteger1));
        while (nestedIterator.hasNext()) {
            actual.add(nestedIterator.next());
        }
        assertEquals(ans, actual);
    }
}