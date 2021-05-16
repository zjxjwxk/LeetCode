package com.zjxjwxk.leetcode._0421_Maximum_XOR_of_Two_Numbers_in_an_Array;

import java.util.HashSet;
import java.util.Set;

/**
 * 哈希表 贪心
 * @author Xinkang Wu
 * @date 2021/5/16 17:41
 */
public class Solution {

    private static final int HIGH_INT = 30;

    public int findMaximumXOR(int[] nums) {
        int ans = 0;
        for (int i = HIGH_INT; i >= 0; --i) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num >> i);
            }
            ans <<= 1;
            int x = ans + 1;
            for (int num : nums) {
                if (set.contains(x ^ (num >> i))) {
                    ans = x;
                    break;
                }
            }
        }
        return ans;
    }
}
