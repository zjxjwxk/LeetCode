package com.zjxjwxk.leetcode._053_Maximum_Subarray;

/**
 * @author zjxjwxk
 */
public class Solution2 {

    public int maxSubArray(int[] nums) {
        return divide(nums, 0, nums.length - 1);
    }

    public int divide(int[] nums, int left, int right) {
        if (left >= right) {
            return nums[left];
        }
        int mid = (left + right) / 2;
        int leftMax = divide(nums, left, mid);
        int rightMax = divide(nums, mid + 1, right);
        int sum = 0;
        int tempLeftMax = nums[mid];
        int tempRightMax = nums[mid + 1];
        for (int i = mid; i >= left; i--) {
            sum += nums[i];
            if (sum > tempLeftMax) {
                tempLeftMax = sum;
            }
        }
        sum = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum += nums[i];
            if (sum > tempRightMax) {
                tempRightMax = sum;
            }
        }
        return Math.max(Math.max(leftMax, rightMax), tempLeftMax + tempRightMax);
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max value : " + solution2.maxSubArray(num));
    }
}
