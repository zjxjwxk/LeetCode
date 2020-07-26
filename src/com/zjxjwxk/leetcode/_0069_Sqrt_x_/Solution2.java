package com.zjxjwxk.leetcode._0069_Sqrt_x_;

/**
 * 二分法
 * @author zjxjwxk
 */
public class Solution2 {

    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        long ret = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((long) x > (long) mid * mid) {
                left = mid + 1;
                ret = mid;
            } else if ((long) x < (long) mid * mid) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return (int) ret;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.mySqrt(27));
    }
}
