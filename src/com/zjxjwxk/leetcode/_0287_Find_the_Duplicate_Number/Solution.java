package com.zjxjwxk.leetcode._0287_Find_the_Duplicate_Number;

/**
 * 快慢指针（寻找环形链表入口）
 *
 * @author Xinkang Wu
 * @date 2025/9/15 20:51
 */
public class Solution {

    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        int newSlow = 0;
        while (newSlow != slow) {
            newSlow = nums[newSlow];
            slow = nums[slow];
        }
        return slow;
    }
}
