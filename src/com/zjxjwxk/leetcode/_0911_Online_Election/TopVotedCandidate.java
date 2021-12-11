package com.zjxjwxk.leetcode._0911_Online_Election;

/**
 * 预计算+二分查找
 * @author Xinkang Wu
 * @date 2021/12/11 13:04
 */
public class TopVotedCandidate {

    private final int[] times;
    private final int[] candidates;
    private final int len;

    public TopVotedCandidate(int[] persons, int[] times) {
        len = persons.length;
        this.times = times;
        candidates = new int[len];
        int[] counts = new int[len];
        int maxCount = Integer.MIN_VALUE, maxPerson = 0;
        for (int i = 0; i < len; ++i) {
            int person = persons[i];
            if (++counts[person] >= maxCount) {
                maxCount = counts[person];
                maxPerson = person;
            }
            candidates[i] = maxPerson;
        }
    }

    public int q(int t) {
        int left = 0, right = len - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (t < times[mid]) {
                right = mid - 1;
            } else if (t > times[mid]) {
                left = mid + 1;
            } else {
                return candidates[mid];
            }
        }
        return candidates[right];
    }
}
