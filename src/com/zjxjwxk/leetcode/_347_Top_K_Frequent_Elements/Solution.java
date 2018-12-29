package com.zjxjwxk.leetcode._347_Top_K_Frequent_Elements;

import java.util.*;

/**
 * @author zjxjwxk
 */
public class Solution {

    public List<Integer> topKFrequent(int[] nums, int k) {

        // 将元素值和出现频率作为键值对放入Map
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num :
                nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        /*
            构建大小为k的优先队列（默认为最小堆，
            并为优先队列重新定义了Integer
            的大小比较依据：为map中Integer键所对应的值，
            即出现的频率）
            遍历所有map中的元素，和堆顶元素比较
            若频率比堆顶元素小，替换它
            得到的即为频率前k高的元素的键
        */
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> map.get(o1) - map.get(o2));
        for (int key :
                map.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else if (map.get(key) > map.get(pq.peek())){
                pq.poll();
                pq.add(key);
            }
        }

        // 将优先队列中的元素放入链表中返回
        LinkedList<Integer> res = new LinkedList<>();
        while (!pq.isEmpty()) {
            res.add(pq.remove());
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, -1, 2, -1, 2, 3};
        int k = 2;
        Solution solution = new Solution();
        List<Integer> list = solution.topKFrequent(nums, k);
        for (Integer i :
                list) {
            System.out.println(i);
        }
    }
}