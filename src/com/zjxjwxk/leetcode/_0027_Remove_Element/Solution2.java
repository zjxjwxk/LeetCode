package com.zjxjwxk.leetcode._0027_Remove_Element;

/**
 * 当前元素需要移除时，与最后一个元素交换，并将长度减1
 * (使用“元素顺序可以更改”这一条件)
 * @author zjxjwxk
 */
public class Solution2 {

    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i = 0;
        while (i < len) {
            if (nums[i] == val) {
                nums[i] = nums[len - 1];
                len--;
            } else {
                i++;
            }
        }
        return len;
    }

    public void printArray(int[] array, int len) {
        for (int i = 0; i < len; i ++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] nums = {3, 2, 2, 3};
        int len = solution2.removeElement(nums, 3);
        System.out.println("Length : " + len);
        solution2.printArray(nums, len);
    }
}
