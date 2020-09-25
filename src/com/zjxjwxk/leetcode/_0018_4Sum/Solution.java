package com.zjxjwxk.leetcode._0018_4Sum;

import java.util.*;

/**
 * @author Xinkang Wu
 * @date 2020/9/24 10:53 下午
 */
public class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length, sum = 0;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < len - 3; ++i) {
            sum += nums[i];
            if (i > 0 && nums[i] == nums[i - 1] || ifContinue(nums, sum, 1, target)) {
                sum -= nums[i];
                continue;
            }
            if (ifBreak(nums, sum, 1, i + 1, target)) {
                break;
            }
            for (int j = i + 1; j < len - 2; ++j) {
                sum += nums[j];
                if (j > i + 1 && nums[j] == nums[j - 1] || ifContinue(nums, sum, 2, target)) {
                    sum -= nums[j];
                    continue;
                }
                if (ifBreak(nums, sum, 2, j + 1, target)) {
                    sum -= nums[j];
                    break;
                }
                for (int k = j + 1; k < len - 1; ++k) {
                    sum += nums[k];
                    if (k > j + 1 && nums[k] == nums[k - 1] || ifContinue(nums, sum, 3, target)) {
                        sum -= nums[k];
                        continue;
                    }
                    if (ifBreak(nums, sum, 3, k + 1, target)) {
                        sum -= nums[k];
                        break;
                    }
                    int t = findTarget(nums, k + 1, len - 1, target - sum);
                    if (t != -1) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[t]));
                    }
                    sum -= nums[k];
                }
                sum -= nums[j];
            }
            sum -= nums[i];
        }
        return result;
    }

    private boolean ifContinue(int[] nums, int sum, int level, int target) {
        int count = 4 - level, max = 0;
        for (int i = nums.length - count; i < nums.length; ++i) {
            max += nums[i];
        }
        return sum + max < target;
    }

    private boolean ifBreak(int[] nums, int sum, int level, int startIndex, int target) {
        int count = 4 - level, min = 0;
        for (int i = startIndex; i < startIndex + count; ++i) {
            min += nums[i];
        }
        return sum + min > target;
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
//        List<List<Integer>> result = solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        List<List<Integer>> result = solution.fourSum(new int[]{0, 4, -5, 2, -2, 4, 2, -1, 4}, 12);
        for (List<Integer> list : result) {
            for (Integer num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
