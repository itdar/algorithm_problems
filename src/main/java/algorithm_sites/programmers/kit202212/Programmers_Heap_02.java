package algorithm_sites.programmers.kit202212;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Programmers_Heap_02 {

    public int solution(int[][] jobs) {
        if (jobs == null || jobs.length == 0) {
            return 0;
        }

        List<Node> nodeList = new ArrayList<>();
        for (int i = 0; i < jobs.length; ++i) {
            nodeList.add(new Node(i, jobs[i][0], jobs[i][1]));
        }

        List<Integer> spentTimes = new LinkedList<>();

        PriorityQueue<Node> priorityQueue = new PriorityQueue();
        int currentTime = nodeList.stream().mapToInt(value -> value.inTime).min().getAsInt();
        while (spentTimes.size() != jobs.length) {
            for (int i = 0; i < nodeList.size(); ++i) {
                if (nodeList.get(i).inTime <= currentTime) {
                    priorityQueue.add(nodeList.get(i));
                    nodeList.remove(i);
                    --i;
                }
            }

            if (priorityQueue.isEmpty()) {
                ++currentTime;
                continue;
            }

            Node node = priorityQueue.poll();
            spentTimes.add((currentTime + node.workingTime) - node.inTime);
            currentTime += node.workingTime;
        }

        return (int) Math.floor(spentTimes.stream()
            .mapToInt(value -> value)
            .sum() / spentTimes.size());
    }

    private class Node implements Comparable<Node> {
        private int index;
        private int inTime;
        private int workingTime;
        private boolean isDone = false;

        public Node(int index, int inTime, int workingTime) {
            this.index = index;
            this.inTime = inTime;
            this.workingTime = workingTime;
        }

        @Override
        public int compareTo(Node o) {
            if (this.workingTime > o.workingTime) {
                return 1;
            }
            return -1;
        }

        public void done() {
            this.isDone = true;
        }
    }

}
