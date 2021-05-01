package com.zjxjwxk.leetcode._0690_Employee_Importance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DFS
 * @author Xinkang Wu
 * @date 2021/5/1 20:02
 */
public class Solution {

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for (Employee employee : employees) {
            employeeMap.put(employee.id, employee);
        }
        return dfs(employeeMap, id);
    }

    private int dfs(Map<Integer, Employee> employeeMap, int id) {
        Employee employee = employeeMap.get(id);
        int sum = employee.importance;
        for (Integer subordinate : employee.subordinates) {
            sum += dfs(employeeMap, subordinate);
        }
        return sum;
    }
}
