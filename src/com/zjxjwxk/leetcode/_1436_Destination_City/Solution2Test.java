package com.zjxjwxk.leetcode._1436_Destination_City;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void destCity1() {
        List<List<String>> paths = DSFactory.newArrayList(new String[][]{
                {"London", "New York"}, {"New York", "Lima"}, {"Lima", "Sao Paulo"}
        });
        String ans = "Sao Paulo";
        assertEquals(ans, solution2.destCity(paths));
    }

    @Test
    void destCity2() {
        List<List<String>> paths = DSFactory.newArrayList(new String[][]{
                {"B", "C"}, {"D", "B"}, {"C", "A"}
        });
        String ans = "A";
        assertEquals(ans, solution2.destCity(paths));
    }

    @Test
    void destCity3() {
        List<List<String>> paths = DSFactory.newArrayList(new String[][]{
                {"A", "Z"}
        });
        String ans = "Z";
        assertEquals(ans, solution2.destCity(paths));
    }
}