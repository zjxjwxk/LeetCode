package com.zjxjwxk.leetcode._0215_Kth_Largest_Element_in_an_Array;

/**
 * 基于堆排序的选择方法
 * @author Xinkang Wu
 * @date 2021/5/19 13:43
 */
public class Solution {

    public int findKthLargest(int[] nums, int k) {
        int len = nums.length, heapSize = len;
        buildHeap(nums, heapSize);
        for (int i = len - 1; i > len - k; --i) {
            swap(nums, 0, i);
            --heapSize;
            maxHeapify(nums, 0, heapSize);
        }
        return nums[0];
    }

    private void buildHeap(int[] maxHeap, int heapSize) {
        for (int i = heapSize / 2; i >= 0; --i) {
            maxHeapify(maxHeap, i, heapSize);
        }
    }

    private void maxHeapify(int[] maxHeap, int index, int heapSize) {
        int left = index * 2 + 1, right = index * 2 + 2, largest = index;
        if (left < heapSize && maxHeap[left] > maxHeap[largest]) {
            largest = left;
        }
        if (right < heapSize && maxHeap[right] > maxHeap[largest]) {
            largest = right;
        }
        if (largest != index) {
            swap(maxHeap, largest, index);
            maxHeapify(maxHeap, largest, heapSize);
        }
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
