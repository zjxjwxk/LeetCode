package com.zjxjwxk.leetcode.util;

import java.util.Arrays;

/**
 * 数据结构工具类
 * @author Xinkang Wu
 * @date 2020/12/2 19:50
 */
public class DSUtil {

    /**
     * 打印泛型数组
     * @param arr 泛型数组
     * @param <T> 泛型
     */
    public static <T> void printArr(T[] arr) {
        printArrByLength(arr, arr.length);
    }

    /**
     * 打印泛型数组
     * 末尾换行
     * @param arr 泛型数组
     * @param <T> 泛型
     */
    public static <T> void printlnArr(T[] arr) {
        printlnArrByLength(arr, arr.length);
    }

    /**
     * 打印二维泛型数组
     * 末尾换行
     * @param arr 二维泛型数组
     * @param <T> 泛型
     */
    public static <T> void printlnArr(T[][] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        printArr(arr[0]);
        for (int i = 1; i < arr.length; ++i) {
            System.out.print(", ");
            printArr(arr[i]);
        }
        System.out.println();
    }

    /**
     * 根据长度，打印泛型数组
     * @param arr 泛型数组
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
        System.out.print(']');
    }

    /**
     * 根据长度，打印泛型数组
     * 末尾换行
     * @param arr 泛型数组
     * @param length 打印长度，从0下标开始
     */
    public static <T> void printlnArrByLength(T[] arr, int length) {
        printArrByLength(arr, length);
        System.out.println();
    }

    /**
     * 包装二维int数组为二维Integer数组
     * @param arr 二维int数组
     * @return 二维Integer数组
     */
    public static Integer[][] boxIntArr(int[][] arr) {
        int len = arr.length;
        Integer[][] boxedArr = new Integer[len][];
        for (int i = 0; i < len; ++i) {
            boxedArr[i] = Arrays.stream(arr[i]).boxed().toArray(Integer[]::new);
        }
        return boxedArr;
    }
}
