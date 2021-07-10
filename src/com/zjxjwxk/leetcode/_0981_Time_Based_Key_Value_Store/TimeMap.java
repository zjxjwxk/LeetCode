package com.zjxjwxk.leetcode._0981_Time_Based_Key_Value_Store;

import java.util.*;

/**
 * 哈希表+二分查找
 * @author Xinkang Wu
 * @date 2021/7/10 16:05
 */
public class TimeMap {

    static class Pair implements Comparable<Pair> {
        String value;
        int timestamp;

        public Pair(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Pair pair = (Pair) o;
            return timestamp == pair.timestamp &&
                    Objects.equals(value, pair.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, timestamp);
        }

        @Override
        public int compareTo(Pair pair) {
            if (this.timestamp != pair.timestamp) {
                return this.timestamp - pair.timestamp;
            }
            return this.value.compareTo(pair.value);
        }
    }

    private final Map<String, List<Pair>> pairListMap;

    /** Initialize your data structure here. */
    public TimeMap() {
        pairListMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        List<Pair> pairList = pairListMap.getOrDefault(key, new ArrayList<>());
        pairList.add(new Pair(value, timestamp));
        pairListMap.put(key, pairList);
    }

    public String get(String key, int timestamp) {
        List<Pair> pairList = pairListMap.get(key);
        if (pairList == null) {
            return "";
        }
        int index = binarySearch(pairList, timestamp);
        return index == -1 ? "" : pairList.get(index).value;
    }

    private int binarySearch(List<Pair> pairList, int timestamp) {
        int left = 0, right = pairList.size() - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            int midTimestamp = pairList.get(mid).timestamp;
            if (midTimestamp < timestamp) {
                left = mid + 1;
            } else if (midTimestamp > timestamp) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return right;
    }
}
