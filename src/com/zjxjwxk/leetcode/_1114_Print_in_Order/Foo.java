package com.zjxjwxk.leetcode._1114_Print_in_Order;

/**
 * synchronized + wait + notifyAll
 *
 * @author Xinkang Wu
 * @date 2025/9/15 21:34
 */
public class Foo {

    private final Object lock = new Object();
    private int num = 0;

    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (lock) {
            while (num % 3 != 0) {
                lock.wait();
            }
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            ++num;
            lock.notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (lock) {
            while (num % 3 != 1) {
                lock.wait();
            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            ++num;
            lock.notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (lock) {
            while (num % 3 != 2) {
                lock.wait();
            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
            ++num;
            lock.notifyAll();
        }
    }
}
