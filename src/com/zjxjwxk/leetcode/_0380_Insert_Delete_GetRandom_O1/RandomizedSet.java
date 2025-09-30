package com.zjxjwxk.leetcode._0380_Insert_Delete_GetRandom_O1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 变长数组+哈希表
 *
 * @author Xinkang Wu
 * @date 2025/9/30 22:07
 */
public class RandomizedSet {

    private final Map<Integer, Integer> valueIndexMap;
    private final List<Integer> list;

    public RandomizedSet() {
        valueIndexMap = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (valueIndexMap.containsKey(val)) {
            return false;
        }
        list.add(val);
        valueIndexMap.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!valueIndexMap.containsKey(val)) {
            return false;
        }
        Integer index = valueIndexMap.remove(val);
        Integer lastVal = list.remove(list.size() - 1);
        if (!lastVal.equals(val)) {
            list.set(index, lastVal);
            valueIndexMap.put(lastVal, index);
        }
        return true;
    }

    public int getRandom() {
        int randomIndex = (int) (Math.random() * list.size());
        return list.get(randomIndex);
    }
}
