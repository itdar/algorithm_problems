package algorithm_sites.programmers.kit202212;

import java.util.PriorityQueue;

public class Programmers_Heap_01 {

    public int solution(int[] scoville, int K) {
        int result = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int sco : scoville) {
            priorityQueue.add(sco);
        }

        while (priorityQueue.peek() < K) {
            if (priorityQueue.size() <= 1) {
                return -1;
            }
            int min1Sco = priorityQueue.poll();
            int min2Sco = priorityQueue.poll();

            int mixed = min1Sco + (2 * min2Sco);
            priorityQueue.add(mixed);

            ++result;
        }

        return result;
    }

}
