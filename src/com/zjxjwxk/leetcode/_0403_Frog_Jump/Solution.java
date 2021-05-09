package com.zjxjwxk.leetcode._0403_Frog_Jump;

import java.util.*;

/**
 * 一次遍历+二分查找
 * 记录每个能到达的石头的前序步数
 * @author Xinkang Wu
 * @date 2021/4/29 22:03
 */
public class Solution {

    public boolean canCross(int[] stones) {
        int len = stones.length;
        if (stones[1] - stones[0] > 1) {
            return false;
        }
        Set<Integer>[] preStepSets = new HashSet[len];
        for (int i = 0; i < len; ++i) {
            preStepSets[i] = new HashSet<>();
        }
        preStepSets[0].add(0);
        int i;
        for (i = 0; i < len - 1; ++i) {
            while (i < len && preStepSets[i].size() == 0) {
                ++i;
            }
            if (i == len) {
                return false;
            }
            for (Integer preStep : preStepSets[i]) {
                for (int curStep = preStep - 1; curStep <= preStep + 1; ++curStep) {
                    int nextIndex = Arrays.binarySearch(stones, i + 1, len, stones[i] + curStep);
                    if (nextIndex >= 0) {
                        preStepSets[nextIndex].add(curStep);
                    }
                }
            }
        }
        return preStepSets[len - 1].size() > 0;
    }
}
