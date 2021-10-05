package com.zjxjwxk.leetcode._0284_Peeking_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 数组实现
 * @author Xinkang Wu
 * @date 2021/10/5 13:17
 */
public class PeekingIterator implements Iterator<Integer> {

    private final int[] nums;
    private int index;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        List<Integer> list = new ArrayList<>();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        nums = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            nums[i] = list.get(i);
        }
        index = 0;
    }

    public PeekingIterator(int[] nums) {
        this.nums = nums;
        index = 0;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return nums[index];
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        return nums[index++];
    }

    @Override
    public boolean hasNext() {
        return index < nums.length;
    }
}
