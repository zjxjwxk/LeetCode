package com.zjxjwxk.leetcode._1011_Capacity_To_Ship_Packages_Within_D_Days;

/**
 * @author Xinkang Wu
 * @date 2021/4/26 23:32
 */
public class Solution {

    public int shipWithinDays(int[] weights, int D) {
        int maxWeight = Integer.MIN_VALUE, weightSum = 0;
        for (int weight : weights) {
            maxWeight = Math.max(maxWeight, weight);
            weightSum += weight;
        }
        int left = maxWeight, right = weightSum;
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (canShipWithinDays(weights, mid, D)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canShipWithinDays(int[] weights, int capacity, int D) {
        int sum = 0, day = 0;
        for (int weight : weights) {
            if (sum + weight <= capacity) {
                sum += weight;
            } else {
                ++day;
                sum = weight;
            }
        }
        return day + 1 <= D;
    }
}
