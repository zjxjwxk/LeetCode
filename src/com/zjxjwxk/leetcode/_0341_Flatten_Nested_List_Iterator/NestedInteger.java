package com.zjxjwxk.leetcode._0341_Flatten_Nested_List_Iterator;

import java.util.List;

/**
 * @author Xinkang Wu
 * @date 2021/3/24 23:29
 */
interface NestedInteger {
    /**
     * @return true if this NestedInteger holds a single integer, rather than a nested list.
     */
    boolean isInteger();

    /**
     * @return the single integer that this NestedInteger holds, if it holds a single integer
     */
    Integer getInteger();

    /**
     * Return null if this NestedInteger holds a single integer
     * @return the nested list that this NestedInteger holds, if it holds a nested list
     */
    List<NestedInteger> getList();
}
