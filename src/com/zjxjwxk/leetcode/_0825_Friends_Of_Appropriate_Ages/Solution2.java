package com.zjxjwxk.leetcode._0825_Friends_Of_Appropriate_Ages;

/**
 * 计数排序+前缀和
 * @author Xinkang Wu
 * @date 2021/12/27 13:39
 */
public class Solution2 {

    public int numFriendRequests(int[] ages) {
        int[] counts = new int[121];
        for (int age : ages) {
            ++counts[age];
        }
        int[] preSum = new int[122];
        for (int i = 1; i <= 121; ++i) {
            preSum[i] = preSum[i - 1] + counts[i - 1];
        }
        int ans = 0;
        for (int age : ages) {
            if (age > 14) {
                ans += preSum[age + 1] - preSum[(int) (age * 0.5 + 7) + 1] - 1;
            }
        }
        return ans;
    }
}
