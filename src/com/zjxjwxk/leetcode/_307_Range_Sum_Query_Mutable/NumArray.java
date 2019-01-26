package com.zjxjwxk.leetcode._307_Range_Sum_Query_Mutable;

/**
 * 不使用线段树
 * 将前i个元素的和保存在sum[]数组中(初始化时需要O(n)时间复杂度)
 * 查询某一区间的和时，只需相减即可(每次查询时仅需要O(1)时间复杂度)
 * 但更新元素时需要O(n)时间复杂度
 * @author zjxjwxk
 */
public class NumArray {

    // sum[i]存储前i个元素和,sum[0] = 0
    // sum[i]存储nums[0...i-1]的和
    private int[] sum;

    private int[] data;

    public NumArray(int[] nums) {

        data = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            data[i] = nums[i];
        }

        sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
    }

    public void update(int index, int val) {
        data[index] = val;
        for (int i = index + 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + data[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }
}
