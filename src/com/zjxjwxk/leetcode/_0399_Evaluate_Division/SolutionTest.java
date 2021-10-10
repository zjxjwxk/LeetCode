package com.zjxjwxk.leetcode._0399_Evaluate_Division;

import com.zjxjwxk.leetcode.util.DSFactory;
import com.zjxjwxk.leetcode.util.DSUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void calcEquation1() {
        List<List<String>> equations = DSFactory.newArrayList(new String[][]{
                {"a", "b"}, {"b", "c"}
        });
        double[] values = {2.0, 3.0};
        List<List<String>> queries = DSFactory.newArrayList(new String[][]{
                {"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"}
        });
        double[] ans = {6.0, 0.5, -1.0, 1.0, -1.0};
        assertArrayEquals(ans, solution.calcEquation(equations, values, queries));
    }

    @Test
    void calcEquation2() {
        List<List<String>> equations = DSFactory.newArrayList(new String[][]{
                {"a", "b"}, {"b", "c"}, {"bc", "cd"}
        });
        double[] values = {1.5, 2.5, 5.0};
        List<List<String>> queries = DSFactory.newArrayList(new String[][]{
                {"a", "c"}, {"c", "b"}, {"bc", "cd"}, {"cd", "bc"}
        });
        double[] ans = {3.75000, 0.40000, 5.00000, 0.20000};
        assertArrayEquals(ans, solution.calcEquation(equations, values, queries));
    }

    @Test
    void calcEquation3() {
        List<List<String>> equations = DSFactory.newArrayList(new String[][]{
                {"a", "b"}
        });
        double[] values = {0.5};
        List<List<String>> queries = DSFactory.newArrayList(new String[][]{
                {"a", "b"}, {"b", "a"}, {"a", "c"}, {"x", "y"}
        });
        double[] ans = {0.50000, 2.00000, -1.00000, -1.00000};
        assertArrayEquals(ans, solution.calcEquation(equations, values, queries));
    }

    @Test
    void calcEquation4() {
        List<List<String>> equations = DSFactory.newArrayList(new String[][]{
                {"a", "b"}, {"e", "f"}, {"b", "e"}
        });
        double[] values = {3.4, 1.4, 2.3};
        List<List<String>> queries = DSFactory.newArrayList(new String[][]{
                {"b", "a"}, {"a", "f"}, {"f", "f"}, {"e", "e"}, {"c", "c"}, {"a", "c"}, {"f", "e"}
        });
        double[] ans = {0.29412, 10.948, 1.0, 1.0, -1.0, -1.0, 0.71429};
        double[] actual = solution.calcEquation(equations, values, queries);
        Double[] actualBoxed = Arrays.stream(actual).boxed().toArray(Double[]::new);
        DSUtil.printlnArr(actualBoxed);
    }
}