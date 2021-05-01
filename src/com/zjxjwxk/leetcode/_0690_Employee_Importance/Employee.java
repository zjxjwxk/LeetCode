package com.zjxjwxk.leetcode._0690_Employee_Importance;

import java.util.List;

/**
 * @author Xinkang Wu
 * @date 2021/5/1 20:53
 */
public class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
}
