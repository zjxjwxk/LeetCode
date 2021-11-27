package com.zjxjwxk.leetcode._0519_Random_Flip_Matrix;

import com.zjxjwxk.leetcode.util.DSUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {

    private final Solution solution = new Solution(3, 1);

    @Test
    void test() {
        DSUtil.printArr(Arrays.stream(solution.flip()).boxed().toArray());
        DSUtil.printArr(Arrays.stream(solution.flip()).boxed().toArray());
        DSUtil.printArr(Arrays.stream(solution.flip()).boxed().toArray());
        solution.reset();
        DSUtil.printArr(Arrays.stream(solution.flip()).boxed().toArray());
    }
}