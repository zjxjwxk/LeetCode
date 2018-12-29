package com.zjxjwxk.leetcode._026_Remove_Duplicates_from_Sorted_Array;

/**
 * @author zjxjwxk
 */
public class Solution2 {

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 0){
            return 0;
        }
        int i = 0;
        for (int j = 1; j < len; j++){
            if (nums[j] != nums[i]){
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int len = removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
