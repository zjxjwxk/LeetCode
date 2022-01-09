package com.zjxjwxk.leetcode._1248_Count_Number_of_Nice_Subarrays;

/**
 * 预处理+滑动窗口
 * @author Xinkang Wu
 * @date 2022/1/8 20:41
 */
public class Solution2 {

    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0, len = nums.length, ans = 0;
        int[] odd = new int[len + 2];
        for (int i = 0; i < len; ++i) {
            if ((nums[i] & 1) == 1) {
                odd[++count] = i;
            }
        }
        odd[0] = -1;
        odd[++count] = len;
        for (int i = 1; i + k <= count; ++i) {
            ans += (odd[i] - odd[i - 1]) * (odd[i + k] - odd[i + k - 1]);
        }
        return ans;
    }
}
