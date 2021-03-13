package com.zjxjwxk.leetcode._0705_Design_HashSet;

import java.util.LinkedList;
import java.util.List;

/**
 * 链地址法
 * @author Xinkang Wu
 * @date 2021/3/13 13:44
 */
public class MyHashSet {

    private final List<Integer>[] hashTable;
    private final int len;

    /** Initialize your data structure here. */
    public MyHashSet() {
        len = 769;
        hashTable = new LinkedList[len];
    }

    public void add(int key) {
        int index = key % len;
        List<Integer> list = hashTable[index];
        if (list == null) {
            hashTable[index] = new LinkedList<>();
            hashTable[index].add(key);
        } else {
            for (Integer value : list) {
                if (value == key) {
                    return;
                }
            }
            list.add(key);
        }
    }

    public void remove(int key) {
        int index = key % len;
        List<Integer> list = hashTable[index];
        if (list != null) {
            list.remove(Integer.valueOf(key));
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int index = key % len;
        List<Integer> list = hashTable[index];
        return list != null && list.contains(key);
    }
}
