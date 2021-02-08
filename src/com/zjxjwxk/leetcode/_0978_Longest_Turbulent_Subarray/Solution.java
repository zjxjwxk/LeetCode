package com.zjxjwxk.leetcode._0978_Longest_Turbulent_Subarray;

/**
 * 滑动窗口
 * @author Xinkang Wu
 * @date 2021/2/8 22:37
 */
public class Solution {

    public int maxTurbulenceSize(int[] arr) {
        int i = 0, j = 0, len = arr.length, ans = 0;
        int preFlag = 0;
        while (j < len - 1) {
            int flag = Integer.compare(arr[j], arr[j + 1]);
            if (arr[j] == arr[j + 1]) {
                ans = Math.max(ans, j - i + 1);
                i = j + 1;
            } else if (j != 0 && (flag == preFlag && preFlag != 0)) {
                ans = Math.max(ans, j - i + 1);
                i = j;
            }
            preFlag = flag;
            ++j;
        }
        ans = Math.max(ans, j - i + 1);
        return ans;
    }
}
