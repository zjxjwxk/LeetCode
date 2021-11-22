package com.zjxjwxk.leetcode._0384_Shuffle_an_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 利用Collections.shuffle()
 * 底层使用Fisher-Yates洗牌算法
 * @author Xinkang Wu
 * @date 2021/11/22 14:44
 */
public class Solution {

    private final int[] origin;
    private final int[] nums;
    private final List<Integer> list;

    public Solution(int[] nums) {
        this.nums = nums;
        origin = nums.clone();
        list = Arrays.stream(nums).boxed().collect(Collectors.toList());
    }

    public int[] reset() {
        return origin;
    }

    public int[] shuffle() {
        Collections.shuffle(list);
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}
