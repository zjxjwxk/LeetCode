package com.zjxjwxk.leetcode._0007_Reverse_Integer;

/**
 * @author zjxjwxk
 */
public class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
            int pop = x % 10;
            x /= 10;

            if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)){
                return 0;
            }
            if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)){
                return 0;
            }

            rev = rev * 10 + pop;
        }

        return rev;
    }

    public static void main(String[] args) {
        int input = 2147483647;
        Solution solution = new Solution();
        System.out.println("Input:" + input);
        System.out.println("Output:" + solution.reverse(input));
    }
}