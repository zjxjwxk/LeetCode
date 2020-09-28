package com.zjxjwxk.leetcode._0946_Validate_Stack_Sequences;

/**
 * @author zjxjwxk
 * @date 2020/9/28 4:28 下午
 */
public class Solution {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int[] stack = new int[1000];
        int len = popped.length, j = 0, index = -1;
        for (int popNum : popped) {
            if (index == -1 || stack[index] != popNum) {
                while (index == -1 || stack[index] != popNum) {
                    if (j == len) {
                        return false;
                    }
                    stack[++index] = pushed[j++];
                }
            }
            --index;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] pushed = new int[]{1, 2, 3, 4, 5}, popped = new int[]{4,3,5,1,2};
        System.out.println(solution.validateStackSequences(pushed, popped));
    }
}
