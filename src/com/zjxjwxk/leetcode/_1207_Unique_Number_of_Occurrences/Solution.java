package com.zjxjwxk.leetcode._1207_Unique_Number_of_Occurrences;

/**
 * 数组实现
 * @author Xinkang Wu
 * @date 2020/10/28 6:19 下午
 */
public class Solution {

    public boolean uniqueOccurrences(int[] arr) {
        int[] counts = new int[2001];
        boolean[] countFlag = new boolean[2001];
        for (int num : arr) {
            ++counts[num + 1000];
        }
        for (int count : counts) {
            if (count != 0) {
                if (countFlag[count]) {
                    return false;
                }
                countFlag[count] = true;
            }
        }
        return true;
    }
}
