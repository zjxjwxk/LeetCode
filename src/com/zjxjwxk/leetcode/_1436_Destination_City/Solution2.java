package com.zjxjwxk.leetcode._1436_Destination_City;

import java.util.*;

/**
 * 哈希集合
 * @author Xinkang Wu
 * @date 2021/10/1 13:43
 */
public class Solution2 {

    public String destCity(List<List<String>> paths) {
        Set<String> sourceSet = new HashSet<>();
        for (List<String> path : paths) {
            sourceSet.add(path.get(0));
        }
        for (List<String> path : paths) {
            String dest = path.get(1);
            if (!sourceSet.contains(dest)) {
                return dest;
            }
        }
        return "";
    }
}
