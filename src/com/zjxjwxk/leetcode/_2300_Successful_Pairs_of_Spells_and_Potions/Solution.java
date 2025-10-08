package com.zjxjwxk.leetcode._2300_Successful_Pairs_of_Spells_and_Potions;

import java.util.Arrays;

/**
 * 排序+二分搜索
 *
 * @author Xinkang Wu
 * @date 2025/10/8 15:40
 */
public class Solution {

        public int[] successfulPairs(int[] spells, int[] potions, long success) {
            int n = spells.length, m = potions.length;
            Arrays.sort(potions);
            int[] ans = new int[n];
            for (int i = 0; i < n; ++i) {
                int target = (int) Math.ceil((double) success / spells[i]);
                int index = binarySearch(potions, 0, m - 1, target);
                ans[i] = m - index;
            }
            return ans;
        }

        private int binarySearch(int[] potions, int left, int right, int target) {
            int mid;
            while (left <= right) {
                mid = left + ((right - left) >> 1);
                if (potions[mid] >= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }
}
