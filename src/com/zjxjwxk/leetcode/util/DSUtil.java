package com.zjxjwxk.leetcode.util;

/**
 * 数据结构工具类
 * @author Xinkang Wu
 * @date 2020/12/2 19:50
 */
public class DSUtil {

    /**
     * 打印int类型数组
     * @param arr int数组
     */
    public static <T> void printArr(T[] arr) {
        printArrByLength(arr, arr.length);
    }

    /**
     * 根据长度，打印int类型数组
     * @param arr int数组
     * @param length 打印长度，从0下标开始
     */
    public static <T> void printArrByLength(T[] arr, int length) {
        System.out.print('[');
        for (int i = 0; i < length; ++i) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println(']');
    }
}
