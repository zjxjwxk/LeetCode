package com.zjxjwxk.leetcode._1418_Display_Table_of_Food_in_a_Restaurant;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void displayTable1() {
        List<List<String>> orders = DSFactory.newArrayList(new String[][]{
                {"David", "3", "Ceviche"},
                {"Corina", "10", "Beef Burrito"},
                {"David", "3", "Fried Chicken"},
                {"Carla", "5", "Water"},
                {"Carla", "5", "Ceviche"},
                {"Rous", "3", "Ceviche"}
        });
        List<List<String>> ans = DSFactory.newArrayList(new String[][]{
                {"Table", "Beef Burrito", "Ceviche", "Fried Chicken", "Water"},
                {"3", "0", "2", "1", "0"},
                {"5", "0", "1", "0", "1"},
                {"10", "1", "0", "0", "0"}
        });
        assertEquals(ans, solution.displayTable(orders));
    }

    @Test
    void displayTable2() {
        List<List<String>> orders = DSFactory.newArrayList(new String[][]{
                {"James", "12", "Fried Chicken"},
                {"Ratesh", "12", "Fried Chicken"},
                {"Amadeus", "12", "Fried Chicken"},
                {"Adam", "1", "Canadian Waffles"},
                {"Brianna", "1", "Canadian Waffles"}
        });
        List<List<String>> ans = DSFactory.newArrayList(new String[][]{
                {"Table", "Canadian Waffles", "Fried Chicken"},
                {"1", "2", "0"},
                {"12", "0", "3"}
        });
        assertEquals(ans, solution.displayTable(orders));
    }

    @Test
    void displayTable3() {
        List<List<String>> orders = DSFactory.newArrayList(new String[][]{
                {"Laura", "2", "Bean Burrito"},
                {"Jhon", "2", "Beef Burrito"},
                {"Melissa", "2", "Soda"}
        });
        List<List<String>> ans = DSFactory.newArrayList(new String[][]{
                {"Table", "Bean Burrito", "Beef Burrito", "Soda"},
                {"2", "1", "1", "1"}
        });
        assertEquals(ans, solution.displayTable(orders));
    }
}