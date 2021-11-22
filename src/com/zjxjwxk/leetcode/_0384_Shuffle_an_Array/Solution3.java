package com.zjxjwxk.leetcode._0384_Shuffle_an_Array;

import java.util.Random;

/**
 * Fisher-Yates洗牌算法
 * 即Collections.shuffle()底层算法
 * @author Xinkang Wu
 * @date 2021/11/22 14:44
 */
public class Solution3 {

    private final int[] origin;
    private final int[] nums;

    public Solution3(int[] nums) {
        this.nums = nums;
        origin = nums.clone();
    }

    public int[] reset() {
        System.arraycopy(origin, 0, nums, 0, nums.length);
        return nums;
    }

    public int[] shuffle() {
        Random random = new Random();
        for (int i = 0; i < nums.length; ++i) {
            swap(nums, i + random.nextInt(nums.length - i), i);
        }
        return nums;
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
