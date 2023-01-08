package algorithm_sites.programmers.kit202212;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Programmers_Heap_02 {

    public int solution(int[][] jobs) {
        if (jobs == null || jobs.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        List<Node> nodeList = new LinkedList<>();
        for (int i = 0; i < jobs.length; ++i) {
            nodeList.add(new Node(i, jobs[i][0], jobs[i][1]));
            set.add(jobs[i][0]);
        }

        Node currentTask = null;
        PriorityQueue<Node> priorityQueue = new PriorityQueue();
        for (Integer inTime : set) {
            for (int i = 0; i < nodeList.size(); ++i) {
                if (nodeList.get(i).inTime <= inTime) {
                    priorityQueue.add(nodeList.get(i));
                }
            }

            if (!priorityQueue.isEmpty()) {
                if (currentTask == null) {
                    currentTask = priorityQueue.poll();
                }
            }
        }

//        while (!priorityQueue.isEmpty()) {
//            System.out.print(priorityQueue.poll().workingTime + ",");
//        }

        int answer = 0;
        return answer;
    }

    private class Node implements Comparable<Node> {
        private int index;
        private int inTime;
        private int workingTime;

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
    }

}
