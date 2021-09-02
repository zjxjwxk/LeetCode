package com.zjxjwxk.leetcode._0457_Circular_Array_Loop;

/**
 * 快慢指针
 * @author Xinkang Wu
 * @date 2021/9/1 21:45
 */
public class Solution {

    public boolean circularArrayLoop(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            if (nums[i] == 0) {
                continue;
            }
            int slow = i, fast = getNext(nums, i);
            while (nums[slow] * nums[fast] > 0 && nums[fast] * nums[getNext(nums, fast)] > 0) {
                if (slow == fast) {
                    if (slow != getNext(nums, slow)) {
                        return true;
                    } else {
                        break;
                    }
                }
                slow = getNext(nums, slow);
                fast = getNext(nums, getNext(nums, fast));
            }
            int cur = i;
            while (nums[cur] * nums[getNext(nums, cur)] > 0) {
                int temp = cur;
                cur = getNext(nums, cur);
                nums[temp] = 0;
            }
        }
        return false;
    }

    private int getNext(int[] nums, int index) {
        int len = nums.length;
        return ((index + nums[index]) % len + len) % len;
    }
}
