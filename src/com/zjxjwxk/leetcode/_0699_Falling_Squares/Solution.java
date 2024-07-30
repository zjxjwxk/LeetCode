package com.zjxjwxk.leetcode._0699_Falling_Squares;

import java.util.*;

/**
 * 有序集合
 * @author Xinkang Wu
 * @date 2024/7/30 23:49
 */
public class Solution {

    public List<Integer> fallingSquares(int[][] positions) {
        List<Integer> ans = new ArrayList<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(0, 0);
        for (int[] position : positions) {
            int length = position[1], left = position[0], right = position[0] + length;
            Integer leftFloor = treeMap.floorKey(left);
            Integer rightLower = treeMap.lowerKey(right);
            Integer rightLowerHigher = treeMap.higherKey(rightLower);

            // 寻找落下的最大高度
            Map<Integer, Integer> tailMap = treeMap.tailMap(leftFloor);
            int maxHeight = 0;
            for (Map.Entry<Integer, Integer> entry : tailMap.entrySet()) {
                if (entry.getKey() > rightLower) {
                    break;
                }
                maxHeight = Math.max(maxHeight, entry.getValue() + length);
            }

            // 更新落下后的左右高度
            treeMap.put(left, maxHeight);
            if (rightLowerHigher == null || rightLowerHigher > right) {
                treeMap.put(right, treeMap.get(rightLower));
            } else if (rightLowerHigher == right) {
                treeMap.put(right, treeMap.get(right));
            }

            // 删除中间的所有高度
            Set<Integer> tailSet = new TreeSet<>(tailMap.keySet());
            for (Integer key : tailSet) {
                if (key <= left) {
                    continue;
                }
                if (key >= right) {
                    break;
                }
                treeMap.remove(key);
            }

            int size = ans.size();
            ans.add(size > 0 ? Math.max(ans.get(size - 1), maxHeight) : maxHeight);
        }
        return ans;
    }
}
