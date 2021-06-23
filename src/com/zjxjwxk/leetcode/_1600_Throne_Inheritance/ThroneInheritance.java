package com.zjxjwxk.leetcode._1600_Throne_Inheritance;

import java.util.*;

/**
 * 二叉树的前序遍历
 * @author Xinkang Wu
 * @date 2021/6/23 10:42
 */
public class ThroneInheritance {

    private final Map<String, List<String>> childMap;
    private final Set<String> deadSet;
    private final String kingName;

    public ThroneInheritance(String kingName) {
        this.childMap = new HashMap<>();
        this.deadSet = new HashSet<>();
        this.kingName = kingName;
    }

    public void birth(String parentName, String childName) {
        List<String> childList = childMap.getOrDefault(parentName, new ArrayList<>());
        childList.add(childName);
        childMap.put(parentName, childList);
    }

    public void death(String name) {
        deadSet.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> ans = new ArrayList<>();
        getInheritanceOrderRecursively(kingName, ans);
        return ans;
    }

    private void getInheritanceOrderRecursively(String curName, List<String> curOrder) {
        if (!deadSet.contains(curName)) {
            curOrder.add(curName);
        }
        List<String> childList = childMap.get(curName);
        if (childList != null) {
            for (String childName : childMap.get(curName)) {
                getInheritanceOrderRecursively(childName, curOrder);
            }
        }
    }
}
