package com.zjxjwxk.leetcode._0026_Remove_Duplicates_from_Sorted_Array;

/**
 * @author zjxjwxk
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int count = 1;
        for (int i = 1; i < len; i++){
            if (nums[i] != nums[i - 1]){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
