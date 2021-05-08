package com.zjxjwxk.leetcode._1723_Find_Minimum_Time_to_Finish_All_Jobs;

import java.util.Arrays;

/**
 * 二分查找 + 回溯 + 剪枝
 *
 * @author Xinkang Wu
 * @date 2021/5/8 19:07
 */
public class Solution {

    public int minimumTimeRequired(int[] jobs, int k) {
        int[] workloads = new int[k];
        Arrays.sort(jobs);
        return findK(jobs, workloads);
    }

    private int findK(int[] jobs, int[] workloads) {
        int left = Integer.MIN_VALUE, right = 0, mid, len = jobs.length;
        for (int job : jobs) {
            left = Math.max(left, job);
            right += job;
        }
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (dfs(jobs, len - 1, workloads, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            Arrays.fill(workloads, 0);
        }
        return left;
    }

    private boolean dfs(int[] jobs, int index, int[] workloads, int limit) {
        if (index < 0) {
            return true;
        }
        for (int i = 0; i < workloads.length; ++i) {
            if (workloads[i] + jobs[index] <= limit) {
                workloads[i] += jobs[index];
                if (dfs(jobs, index - 1, workloads, limit)) {
                    return true;
                }
                workloads[i] -= jobs[index];
                if (workloads[i] == 0 || workloads[i] + jobs[index] == limit) {
                    return false;
                }
            }
        }
        return false;
    }
}
