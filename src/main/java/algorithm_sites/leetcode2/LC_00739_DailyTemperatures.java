package algorithm_sites.leetcode2;

import java.util.Stack;

public class LC_00739_DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] results = new int[temperatures.length];

        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; ++i) {
            int temperature = temperatures[i];

            while (!stack.isEmpty() && stack.peek().val < temperature) {
                Node poped = stack.pop();
                results[poped.index] = i - poped.index;
            }

            stack.push(new Node(i, temperature));
        }

        return results;
    }

    private static class Node {
        private int index;
        private int val;

        public Node(int index, int val) {
            this.index = index;
            this.val = val;
        }
    }

}
