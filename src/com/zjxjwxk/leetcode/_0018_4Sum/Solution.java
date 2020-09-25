package com.zjxjwxk.leetcode._0018_4Sum;

import java.util.*;

/**
 * @author Xinkang Wu
 * @date 2020/9/24 10:53 下午
 */
public class Solution {

    List<Integer> temp = new ArrayList<>(4);

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length, sum = 0;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < len - 3; ++i) {
            temp.add(nums[i]);
            sum += nums[i];
            if (ifContinue(nums, sum, i + 1, target)) {
                for (int j = i + 1; j < len - 2; ++j) {
                    temp.add(nums[j]);
                    sum += nums[j];
                    if (ifContinue(nums, sum, j + 1, target)) {
                        for (int k = j + 1; k < len - 1; ++k) {
                            temp.add(nums[k]);
                            sum += nums[k];
                            if (ifContinue(nums, sum, k + 1, target)) {
                                int t = findTarget(nums, k + 1, len - 1, target - nums[i] - nums[j] - nums[k]);
                                if (t != -1) {
                                    temp.add(nums[t]);
                                    set.add(new ArrayList<>(temp));
                                    temp.remove(3);
                                }
                            }
                            temp.remove(2);
                            sum -= nums[k];
                        }
                    }
                    temp.remove(1);
                    sum -= nums[j];
                }
            }
            temp.remove(0);
            sum -= nums[i];
        }
        return new ArrayList<>(set);
    }

    private boolean ifContinue(int[] nums, int sum, int startIndex, int target) {
        int count = 4 - temp.size(), min = 0, max = 0;
        for (int i = startIndex; i < startIndex + count; ++i) {
            min += nums[i];
        }
        for (int i = nums.length - count; i < nums.length; ++i) {
            max += nums[i];
        }
        return max >= (target - sum)  && min <= (target - sum);
    }

    private int findTarget(int[] nums, int start, int end, int target) {
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        for (List<Integer> list : result) {
            for (Integer num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
