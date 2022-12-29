package algorithm_sites.programmers.kit202212;

import java.util.Deque;
import java.util.LinkedList;

public class Programmers_StackQueue_04 {

    public int solution(int[] priorities, int location) {

        Deque<Priority> deque = new LinkedList<>();
        for (int i = 0; i < priorities.length; ++i) {
            deque.offerLast(new Priority(priorities[i], i));
        }

        int count = 0;
        while (!deque.isEmpty()) {
            Priority priority = deque.pollFirst();

            int max = deque.stream()
                .mapToInt(value -> value.priority)
                .max()
                .orElse(0);

            if (priority.priority < max) {
                deque.offerLast(priority);
                continue;
            }

            ++count;

            if (priority.index == location) {
                return count;
            }
        }

        return -1;
    }

    private static class Priority {
        private int priority;
        private int index;

        public Priority(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }

}
