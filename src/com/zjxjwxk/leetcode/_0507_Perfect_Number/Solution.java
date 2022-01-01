package com.zjxjwxk.leetcode._0507_Perfect_Number;

/**
 * @author Xinkang Wu
 * @date 2021/12/31 01:12
 */
public class Solution {

    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int sum = 1, sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; ++i) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
            }
        }
        if (sqrt * sqrt == num) {
            sum -= sqrt;
        }
        return num == sum;
    }
}
