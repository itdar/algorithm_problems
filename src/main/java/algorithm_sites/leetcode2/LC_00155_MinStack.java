package algorithm_sites.leetcode2;

import static java.lang.System.out;

import java.util.Stack;

public class LC_00155_MinStack {

    private int[] array;
    private int minIndex;
    private Stack<Integer> minIndexDiff;
    private int currentIndex;

    public LC_00155_MinStack() {
        array = new int[3 * 10_000];
        minIndex = -1;
        minIndexDiff = new Stack<>();
        currentIndex = 0;
    }

    public void push(int val) {
        ++currentIndex;
        array[currentIndex] = val;

        if (minIndex == -1) {
            minIndex = currentIndex;
        } else {
            if (array[minIndex] > array[currentIndex]) {
                minIndexDiff.push(minIndex - currentIndex);
                minIndex = currentIndex;
            }
        }
    }

    public void pop() {
        if (minIndex == currentIndex) {
            if (minIndexDiff.isEmpty()) {
                minIndex = -1;
                return;
            }
            minIndex = currentIndex + minIndexDiff.pop();
        }
        --currentIndex;
    }

    public int top() {
        return array[currentIndex];
    }

    public int getMin() {
        return array[minIndex];
    }

    public static void main(String[] args) {
        int result;
        LC_00155_MinStack minStack = new LC_00155_MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        result = minStack.getMin(); // return -3
        out.println(result);
        minStack.pop();
        result = minStack.top();    // return 0
        out.println(result);
        result = minStack.getMin(); // return -2
        out.println(result);
    }
}
