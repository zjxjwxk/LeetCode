package com.zjxjwxk.leetcode._0384_Shuffle_an_Array;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * 暴力
 * 时间复杂度O(n^2)
 * @author Xinkang Wu
 * @date 2021/11/22 14:44
 */
public class Solution2 {

    private final int[] origin;
    private final int[] nums;

    public Solution2(int[] nums) {
        this.nums = nums;
        origin = nums.clone();
    }

    public int[] reset() {
        System.arraycopy(origin, 0, nums, 0, nums.length);
        return nums;
    }

    public int[] shuffle() {
        List<Integer> waitingList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Random random = new Random();
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = waitingList.remove(random.nextInt(waitingList.size()));
        }
        return nums;
    }
}
