package algorithm_sites.programmers.kit202212;

import java.util.Deque;
import java.util.LinkedList;

public class Programmers_StackQueue_06 {

    public int[] solution(int[] prices) {
        int[] results = new int[prices.length];

        for (int i = 0; i < prices.length-1; ++i) {
            int time = 0;
            for (int j = i+1; j < prices.length; ++j) {
                ++time;

                if (prices[i] <= prices[j]) {
                    continue;
                }
                break;
            }
            results[i] = time;
        }

        results[results.length-1] = 0;

        return results;
    }

    public int[] solution2(int[] prices) {
        Deque<Node> deque = new LinkedList<>();
        int[] results = new int[prices.length];

        for (int i = 0; i < prices.length; ++i) {
            int price = prices[i];

            if (deque.isEmpty()) {
                deque.addLast(new Node(i, price));
                continue;
            }


        }

        results[results.length-1] = 0;

        return results;
    }

    private class Node {
        private int index;
        private int price;

        public Node(int index, int price) {
            this.index = index;
            this.price = price;
        }
    }

}
