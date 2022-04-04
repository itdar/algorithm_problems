package algorithm_sites.programmers;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Heap_03_DoublePriorityQueue {

    public int[] solution(String[] operations) {
        int[] answer = {0,0};

        Queue<Integer> minQueue = new PriorityQueue<>();
        Queue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());

        int addCount = 0;
        int removeCount = 0;
        int number;
        for (String operation : operations) {
            if (operation.startsWith("I")) {
                number = Integer.parseInt(operation.substring(2));

                maxQueue.add(number);
                minQueue.add(number);

                ++addCount;
            } else if (maxQueue.size() > 0 && operation.startsWith("D") && operation.endsWith(" 1")) {
                maxQueue.poll();
                ++removeCount;

                if (addCount <= removeCount) {
                    maxQueue.clear();
                    minQueue.clear();
                }
            } else if (minQueue.size() > 0 && operation.startsWith("D") && operation.endsWith("-1")) {
                minQueue.poll();
                ++removeCount;

                if (addCount <= removeCount) {
                    maxQueue.clear();
                    minQueue.clear();
                }
            }
        }

        if (addCount > removeCount) {
            return new int[] {maxQueue.peek(), minQueue.peek()};
        }

        return answer;
    }

}
