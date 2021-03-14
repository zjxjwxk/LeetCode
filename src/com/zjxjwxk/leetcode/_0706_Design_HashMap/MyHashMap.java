package com.zjxjwxk.leetcode._0706_Design_HashMap;

import java.util.LinkedList;
import java.util.List;

/**
 * 链地址法
 * @author Xinkang Wu
 * @date 2021/3/14 11:31
 */
public class MyHashMap {

    private final List<Pair>[] hashTable;
    private final int len;

    /** Initialize your data structure here. */
    public MyHashMap() {
        len = 769;
        hashTable = new LinkedList[len];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = key % len;
        List<Pair> list = hashTable[index];
        if (list == null) {
            hashTable[index] = new LinkedList<>();
        } else {
            for (Pair pair : list) {
                if (pair.key == key) {
                    pair.value = value;
                    return;
                }
            }
        }
        hashTable[index].add(new Pair(key, value));
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = key % len;
        List<Pair> list = hashTable[index];
        if (list != null) {
            for (Pair pair : list) {
                if (pair.key == key) {
                    return pair.value;
                }
            }
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = key % len;
        List<Pair> list = hashTable[index];
        if (list != null) {
            list.removeIf(pair -> pair.key == key);
        }
    }

    static class Pair {
        public int key;
        public int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
