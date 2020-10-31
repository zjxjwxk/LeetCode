package com.zjxjwxk.leetcode._0381_Insert_Delete_GetRandom_O1_Duplicates_allowed;

import java.util.*;

/**
 * @author Xinkang Wu
 * @date 2020/10/31 2:18 下午
 */
public class RandomizedCollection {

    private final Map<Integer, Set<Integer>> numToIndexSetMap;
    private final List<Integer> nums;

    /** Initialize your data structure here. */
    public RandomizedCollection() {
        numToIndexSetMap = new HashMap<>();
        nums = new ArrayList<>();
    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        nums.add(val);
        Set<Integer> indexSet = numToIndexSetMap.getOrDefault(val, new HashSet<>());
        indexSet.add(nums.size() - 1);
        numToIndexSetMap.put(val, indexSet);
        return indexSet.size() == 1;
    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        Set<Integer> indexSet = numToIndexSetMap.get(val);
        if (indexSet == null || indexSet.size() == 0) {
            return false;
        } else {
            Iterator<Integer> iterator = indexSet.iterator();
            int deleteIndex = iterator.next(), lastIndex = nums.size() - 1, lastNum = nums.get(lastIndex);
            nums.set(deleteIndex, lastNum);
            nums.remove(lastIndex);
            iterator.remove();
            if (deleteIndex != lastIndex) {
                Set<Integer> lastSet = numToIndexSetMap.get(lastNum);
                lastSet.remove(lastIndex);
                lastSet.add(deleteIndex);
            }
            return true;
        }
    }

    /** Get a random element from the collection. */
    public int getRandom() {
        return nums.get((int) (Math.random() * nums.size()));
    }
}
