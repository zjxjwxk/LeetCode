package com.zjxjwxk.leetcode._0347_Top_K_Frequent_Elements;

import java.util.*;

/**
 * 快速排序（前K个）
 * 平均时间复杂度：O(n)
 * 空间复杂度：O(n)
 *
 * @author Xinkang Wu
 * @date 2025/8/13 23:02
 */
public class Solution2 {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.merge(num, 1, Integer::sum);
        }
        List<int[]> countList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            countList.add(new int[]{entry.getKey(), entry.getValue()});
        }
        quickSortKElements(countList, 0, countList.size() - 1, k - 1);
        int[] ans = new int[k];
        for (int i = 0; i < k; ++i) {
            ans[i] = countList.get(i)[0];
        }
        return ans;
    }

    private void quickSortKElements(List<int[]> countList, int left, int right, int k) {
        int pivotIndex = left + (int) ((right - left) * Math.random()), pivotCount = countList.get(pivotIndex)[1], index = left;
        Collections.swap(countList, pivotIndex, right);
        for (int i = left; i < right; ++i) {
            if (countList.get(i)[1] >= pivotCount) {
                Collections.swap(countList, index++, i);
            }
        }
        Collections.swap(countList, index, right);
        if (index < k) {
            quickSortKElements(countList, index + 1, right, k);
        } else if (index > k) {
            quickSortKElements(countList, left, index - 1, k);
        }
    }
}
