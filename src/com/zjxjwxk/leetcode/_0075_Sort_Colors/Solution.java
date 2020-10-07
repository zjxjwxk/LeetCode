package com.zjxjwxk.leetcode._0075_Sort_Colors;

/**
 * 计数排序
 * @author zjxjwxk
 * @date 2020/10/7 9:59 上午
 */
public class Solution {

    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for (int num : nums) {
            ++count[num];
        }
        int index = 0;
        for (int i = 0; i < count.length; ++i) {
            while (count[i] != 0) {
                nums[index++] = i;
                --count[i];
            }
        }
    }
}
