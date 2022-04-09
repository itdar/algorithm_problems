package algorithm_sites.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class StackQueue_2_Printer {

    public int solution(int[] priorities, int location) {
        Queue<Paper> priorityQueue = new LinkedList<>();

        for (int i = 0; i < priorities.length; ++i) {
            priorityQueue.add(new Paper(i, priorities[i]));
        }

        int count = 0;
        while (!priorityQueue.isEmpty()) {
            Paper pollPaper = priorityQueue.poll();

            if (hasBiggerOne(priorityQueue, pollPaper.priority)) {
                priorityQueue.add(pollPaper);
                continue;
            }

            ++count;
            if (location == pollPaper.index) {
                return count;
            }
        }

        return count;
    }

    private boolean hasBiggerOne(Queue<Paper> queue, int number) {
        for (Paper paper : queue) {
            if (number < paper.priority) {
                return true;
            }
        }
        return false;
    }

    static class Paper {
        int index;
        int priority;

        public Paper(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }

}
