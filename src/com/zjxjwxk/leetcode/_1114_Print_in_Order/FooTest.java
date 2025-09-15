package com.zjxjwxk.leetcode._1114_Print_in_Order;

import org.junit.jupiter.api.Test;

class FooTest {

    @Test
    void test() {
        // 交替打印ABC 10次
        Foo foo = new Foo();
        Runnable printFirst = () -> System.out.print("A");
        Runnable printSecond = () -> System.out.print("B");
        Runnable printThird = () -> System.out.print("C");

        for (int i = 0; i < 10; ++i) {
            try {
                foo.first(printFirst);
                foo.second(printSecond);
                foo.third(printThird);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}