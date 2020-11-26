package com.zjxjwxk.leetcode._0164_Maximum_Gap;

import java.util.Arrays;

/**
 * 基于桶的算法
 * @author Xinkang Wu
 * @date 2020/11/26 14:33
 */
public class Solution2 {

    public int maximumGap(int[] nums) {
        int len = nums.length, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        if (len < 2) {
            return 0;
        }
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int d = Math.max(1, (max - min) / (len - 1));
        int bucketSize = (max - min) / d + 1;
        int[][] bucket = new int[bucketSize][2];
        for (int i = 0; i < bucketSize; ++i) {
            Arrays.fill(bucket[i], -1);
        }
        for (int num : nums) {
            int index = (num - min) / d;
            if (bucket[index][0] == -1) {
                bucket[index][0] = bucket[index][1] = num;
            } else {
                bucket[index][0] = Math.min(bucket[index][0], num);
                bucket[index][1] = Math.max(bucket[index][1], num);
            }
        }
        int ans = 0, pre = -1;
        for (int i = 0; i < bucketSize; ++i) {
            if (bucket[i][0] != -1) {
                if (pre != -1) {
                    ans = Math.max(ans, bucket[i][0] - bucket[pre][1]);
                }
                pre = i;
            }
        }
        return ans;
    }
}
