package com.zjxjwxk.leetcode.util;

import java.util.*;

/**
 * 任意顺序List
 * 重写Equals方法，当该List与另一List的任意排列相同时视为相同
 *
 * @author Xinkang Wu
 * @date 2023/4/15 01:25
 */
public class AnyOrderList<E> extends ArrayList<E> {

    public AnyOrderList(Collection<? extends E> c) {
        super(c);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof List))
            return false;

        List<List<E>> permutationList = getPermutationList((List) o);

        for (List<E> list : permutationList) {
            if (listEqual(this, list)) {
                return true;
            }
        }
        return false;
    }

    private List<List<E>> getPermutationList(List<E> list) {
        List<List<E>> permutationList = new ArrayList<>();
        permutation(permutationList, list, 0);
        return permutationList;
    }

    private void permutation(List<List<E>> permutationList, List<E> list, int index) {
        if (index == list.size()) {
            permutationList.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < list.size(); ++i) {
            Collections.swap(list, index, i);
            permutation(permutationList, list, index + 1);
            Collections.swap(list, index, i);
        }
    }

    private boolean listEqual(List<E> list1, List<E> list2) {
        ListIterator<E> e1 = list1.listIterator();
        ListIterator<?> e2 = list2.listIterator();
        while (e1.hasNext() && e2.hasNext()) {
            E o1 = e1.next();
            Object o2 = e2.next();
            if (!(Objects.equals(o1, o2)))
                return false;
        }
        return !(e1.hasNext() || e2.hasNext());
    }
}
