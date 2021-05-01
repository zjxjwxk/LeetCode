package com.zjxjwxk.leetcode._0690_Employee_Importance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getImportance() {
        List<Employee> employees = Arrays.asList(
                new Employee(1, 5, Arrays.asList(2, 3)),
                new Employee(2, 3, new ArrayList<>()),
                new Employee(3, 3, new ArrayList<>()));
        int id = 1;
        int ans = 11;
        assertEquals(ans, solution.getImportance(employees, id));
    }
}