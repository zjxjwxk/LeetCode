package com.zjxjwxk.leetcode._027_Remove_Element;

/**
 * 双指针（快慢指针）
 * @author zjxjwxk
 */
public class Solution {

    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i = 0;
        // i为慢指针，j为快指针
        for (int j = 0; j < len; j++) {
            // 当指针j指向需要移除的值时，直接跳过；反之则将该值赋给指针i所指向的数，i指针指向下一个元素
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public void printArray(int[] array, int len) {
        for (int i = 0; i < len; i ++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 2, 3};
        int len = solution.removeElement(nums, 3);
        System.out.println("Length : " + len);
        solution.printArray(nums, len);
    }
}
