package com.zjxjwxk.leetcode._0519_Random_Flip_Matrix;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 数组映射
 * @author Xinkang Wu
 * @date 2021/11/27 12:53
 */
public class Solution {

    private final Map<Integer, Integer> indexMap;
    private final Random random;
    private final int m;
    private final int n;
    private int size;

    public Solution(int m, int n) {
        indexMap = new HashMap<>();
        random = new Random();
        this.m = m;
        this.n = n;
        size = m * n;
    }

    public int[] flip() {
        int index = random.nextInt(size);
        Integer realIndex = indexMap.getOrDefault(index, index);
        --size;
        indexMap.put(index, indexMap.getOrDefault(size, size));
        return new int[]{realIndex / n, realIndex % n};
    }

    public void reset() {
        size = m * n;
        indexMap.clear();
    }
}
