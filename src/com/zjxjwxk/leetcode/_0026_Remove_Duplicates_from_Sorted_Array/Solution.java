package com.zjxjwxk.leetcode._0026_Remove_Duplicates_from_Sorted_Array;

/**
 * @author zjxjwxk
 */
public class Solution {

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int count = 0;
        for (int i = 0; i < len - 1; i++){
            if (nums[i] != nums[i + 1]){
                nums[++count] = nums[i + 1];
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int len = removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
