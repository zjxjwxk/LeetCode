package com.zjxjwxk.leetcode._1436_Destination_City;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 哈希表
 * @author Xinkang Wu
 * @date 2021/10/1 13:43
 */
public class Solution {

    public String destCity(List<List<String>> paths) {
        Map<String, String> pathMap = new HashMap<>();
        for (List<String> path : paths) {
            pathMap.put(path.get(0), path.get(1));
        }
        String source = paths.get(0).get(0);
        while (pathMap.get(source) != null) {
            source = pathMap.get(source);
        }
        return source;
    }
}
