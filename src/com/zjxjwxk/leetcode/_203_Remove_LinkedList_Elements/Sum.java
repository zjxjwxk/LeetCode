package com.zjxjwxk.leetcode._203_Remove_LinkedList_Elements;

/**
 * @author zjxjwxk
 */
public class Sum {

    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    // 计算arr[l...n)这个区间内所有数字的和
    private static int sum(int[] arr, int l) {
        if (l == arr.length) {
            return 0;
        } else {
            return arr[l] + sum(arr, l + 1);
        }
    }

    public static void main(String[] args) {
        int[] sums = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(sum(sums));
    }
}
