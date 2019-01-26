package com.zjxjwxk.leetcode._066_Plus_One;

/**
 * @author zjxjwxk
 */
public class Solution {

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }

    public void printArray(int[] nums) {
        for (int n :
                nums) {
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.printArray(solution.plusOne(new int[]{9}));
    }
}
