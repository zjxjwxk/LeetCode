package com.zjxjwxk.leetcode._0146_LRU_Cache;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * HashMap+TreeMap
 * @author Xinkang Wu
 * @date 2022/1/24 02:24
 */
public class LRUCache {

    private int time;
    private final int capacity;
    private final Map<Integer, int[]> map;
    private final TreeMap<Integer, Integer> timeMap;

    public LRUCache(int capacity) {
        time = 0;
        this.capacity = capacity;
        map = new HashMap<>(capacity + 1);
        timeMap = new TreeMap<>();
    }

    public int get(int key) {
        int[] arr = map.get(key);
        if (arr == null) {
            return -1;
        }
        timeMap.remove(arr[1]);
        arr[1] = time;
        timeMap.put(time++, key);
        return arr[0];
    }

    public void put(int key, int value) {
        int[] arr = map.get(key);
        if (arr == null) {
            if (map.size() == capacity) {
                Map.Entry<Integer, Integer> entry = timeMap.pollFirstEntry();
                map.remove(entry.getValue());
            }
            map.put(key, new int[]{value, time});
        } else {
            timeMap.remove(arr[1]);
            arr[0] = value;
            arr[1] = time;
        }
        timeMap.put(time++, key);
    }
}
