package com.zjxjwxk.leetcode._1024_Video_Stitching;

/**
 * 贪心
 * @author Xinkang Wu
 * @date 2020/10/24 3:13 下午
 */
public class Solution2 {

    public int videoStitching(int[][] clips, int T) {
        int[] maxRight = new int[T + 1];
        for (int[] clip : clips) {
            if (clip[0] < T) {
                maxRight[clip[0]] = Math.max(maxRight[clip[0]], clip[1]);
            }
        }
        int last = 0, pre = 0, ans = 0;
        for (int i = 0; i < T; ++i) {
            last = Math.max(last, maxRight[i]);
            if (i == last) {
                return -1;
            }
            if (i == pre) {
                pre = last;
                ++ans;
            }
        }
        return ans;
    }
}
