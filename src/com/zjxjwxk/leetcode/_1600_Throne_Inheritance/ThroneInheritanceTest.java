package com.zjxjwxk.leetcode._1600_Throne_Inheritance;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThroneInheritanceTest {

    @Test
    void getInheritanceOrder() {
        ThroneInheritance throneInheritance = new ThroneInheritance("king");
        throneInheritance.birth("king", "andy");
        throneInheritance.birth("king", "bob");
        throneInheritance.birth("king", "catherine");
        throneInheritance.birth("andy", "matthew");
        throneInheritance.birth("bob", "alex");
        throneInheritance.birth("bob", "asha");
        List<String> ans = Arrays.asList("king", "andy", "matthew", "bob", "alex", "asha", "catherine");
        assertEquals(ans, throneInheritance.getInheritanceOrder());
        throneInheritance.death("bob");
        List<String> ans2 = Arrays.asList("king", "andy", "matthew", "alex", "asha", "catherine");
        assertEquals(ans2, throneInheritance.getInheritanceOrder());
    }
}