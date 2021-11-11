package algorithm_sites.leetcode;

public class LeetCode_1114_PrintInOrder {
}

class Foo {
    private int order = 0;

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        ++order;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (true) {
            if (order >= 1) {
                // printSecond.run() outputs "second". Do not change or remove this line.
                printSecond.run();

                ++order;

                return;
            }
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (true) {
            if (order >= 2) {
                // printThird.run() outputs "third". Do not change or remove this line.
                printThird.run();

                order = 0;

                return;
            }
        }
    }
}