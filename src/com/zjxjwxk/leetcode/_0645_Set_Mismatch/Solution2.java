package com.zjxjwxk.leetcode._0645_Set_Mismatch;

/**
 * 哈希表
 * @author Xinkang Wu
 * @date 2021/7/4 22:03
 */
public class Solution2 {

    public int[] findErrorNums(int[] nums) {
        int xor = 0, len = nums.length;
        for (int num : nums) {
            xor ^= num;
        }
        for (int i = 1; i <= len; ++i) {
            xor ^= i;
        }
        int lowBit = xor & (-xor);
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & lowBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }
        for (int i = 1; i <= len; ++i) {
            if ((i & lowBit) == 0) {
                num1 ^= i;
            } else {
                num2 ^= i;
            }
        }
        for (int num : nums) {
            if (num == num1) {
                return new int[]{num1, num2};
            }
        }
        return new int[]{num2, num1};
    }
}
