package algorithm_sites.programmers;

import java.util.PriorityQueue;
import java.util.Queue;

public class Heap_01_MoreSpicy {

    public int solution(int[] scoville, int K) {
        Queue<Long> priorityQueue = new PriorityQueue<>();

        for (int point : scoville) {
//            if (point < K)
                priorityQueue.add((long) point);
        }

        int count = 0;

        boolean isDone = false;
        while (!isDone && priorityQueue.size() > 1) {
            Long firstMin = priorityQueue.poll();
            Long secondMin = priorityQueue.poll();

            if (firstMin >= K && secondMin >= K) {
                isDone = true;
                break;
            }

            ++count;

            long mix = mix(firstMin, secondMin);

            priorityQueue.add(mix);
        }

        if (priorityQueue.size() == 0) {
            return count;
        }

        if (priorityQueue.size() == 1 && priorityQueue.peek() >= K) {
            return count;
        }

        if (isDone) {
            return count;
        }

        return -1;
    }

    private long mix(long first, long second) {
        return first + (second * 2);
    }

}
