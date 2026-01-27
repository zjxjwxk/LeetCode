package com.zjxjwxk.leetcode._0071_Simplify_Path;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void simplifyPath() {
        String path = "/home/";
        String ans = "/home";
        assertEquals(ans, solution.simplifyPath(path));
    }

    @Test
    void simplifyPath2() {
        String path = "/home//foo/";
        String ans = "/home/foo";
        assertEquals(ans, solution.simplifyPath(path));
    }

    @Test
    void simplifyPath3() {
        String path = "/home/user/Documents/../Pictures";
        String ans = "/home/user/Pictures";
        assertEquals(ans, solution.simplifyPath(path));
    }

    @Test
    void simplifyPath4() {
        String path = "/../";
        String ans = "/";
        assertEquals(ans, solution.simplifyPath(path));
    }

    @Test
    void simplifyPath5() {
        String path = "/.../a/../b/c/../d/./";
        String ans = "/.../b/d";
        assertEquals(ans, solution.simplifyPath(path));
    }
}