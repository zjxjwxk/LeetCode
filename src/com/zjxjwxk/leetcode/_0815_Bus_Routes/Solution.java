package com.zjxjwxk.leetcode._0815_Bus_Routes;

import java.util.*;

/**
 * 广度优先搜索
 * @author Xinkang Wu
 * @date 2021/6/28 23:01
 */
public class Solution {

    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) {
            return 0;
        }
        int len = routes.length;
        Map<Integer, Set<Integer>> stopToRouteSetMap = new HashMap<>();
        for (int route = 0; route < len; ++route) {
            for (int stop = 0; stop < routes[route].length; ++stop) {
                Set<Integer> routeSet = stopToRouteSetMap.getOrDefault(routes[route][stop], new HashSet<>());
                routeSet.add(route);
                stopToRouteSetMap.put(routes[route][stop], routeSet);
            }
        }
        Set<Integer> targetRoute = stopToRouteSetMap.get(target);
        if (targetRoute == null) {
            return -1;
        }
        Queue<Integer> routeQueue = new LinkedList<>();
        Set<Integer> visitedRouteSet = new HashSet<>();
        int step = 1;
        for (int route : stopToRouteSetMap.get(source)) {
            if (targetRoute.contains(route)) {
                return step;
            }
            routeQueue.offer(route);
            visitedRouteSet.add(route);
        }
        while (!routeQueue.isEmpty()) {
            ++step;
            int size = routeQueue.size();
            for (int i = 0; i < size; ++i) {
                for (int stop : routes[routeQueue.poll()]) {
                    for (int nextRoute : stopToRouteSetMap.get(stop)) {
                        if (!visitedRouteSet.contains(nextRoute)) {
                            if (targetRoute.contains(nextRoute)) {
                                return step;
                            }
                            routeQueue.offer(nextRoute);
                            visitedRouteSet.add(nextRoute);
                        }
                    }
                }
            }
        }
        return -1;
    }
}
