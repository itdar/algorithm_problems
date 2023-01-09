package algorithm_sites.programmers.kit202212;

import java.util.Collections;
import java.util.PriorityQueue;

public class Programmers_Heap_03 {

    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minQueue = new PriorityQueue();
        PriorityQueue<Integer> maxQueue = new PriorityQueue(Collections.reverseOrder());

        for (int i = 0; i < operations.length; ++i) {
            String[] s = operations[i].split(" ");
            String operation = s[0];
            int integer = Integer.parseInt(s[1]);

            if (operation.equals("I")) {
                minQueue.add(integer);
                maxQueue.add(integer);
            } else if (operation.equals("D")) {
                if (integer == 1) {
                    Integer max = maxQueue.poll();
                    minQueue.remove(max);
                } else if (integer == -1) {
                    Integer min = minQueue.poll();
                    maxQueue.remove(min);
                }
            }
        }

        if (minQueue.isEmpty()) {
            return new int[] {0,0};
        }
        return new int[] {maxQueue.poll(), minQueue.poll()};
    }

}
