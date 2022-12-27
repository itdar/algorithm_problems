package algorithm_sites.programmers.kit202212;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Programmers_StackQueue_02 {

    public int[] solution(int[] progresses, int[] speeds) {
        if (progresses == null || speeds == null || progresses.length != speeds.length || progresses.length == 0) {
            return new int[] {};
        }

        Queue<TaskP> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; ++i) {
            queue.add(new TaskP(progresses[i], speeds[i]));
        }

        List<Integer> results = new ArrayList<>();
        int count = 0;
        while (!queue.isEmpty()) {
            TaskP task = queue.peek();
            if (!task.isDone) {
                queue.forEach(TaskP::next);

                if (count > 0) {
                    results.add(count);
                }
                count = 0;
                continue;
            }

            queue.poll();
            ++count;
        }

        if (count > 0) {
            results.add(count);
        }

        return results.stream()
            .mapToInt(value -> value)
            .toArray();
    }

    private static class TaskP {
        private int progress;
        private int speed;
        private boolean isDone = false;

        public TaskP(int progress, int speed) {
            this.progress = progress;
            this.speed = speed;
        }

        public void next() {
            if (isDone) {
                return;
            }

            this.progress += this.speed;
            if (this.progress >= 100) {
                this.isDone = true;
            }
        }
    }

}
