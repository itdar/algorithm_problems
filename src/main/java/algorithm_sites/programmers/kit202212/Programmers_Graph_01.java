package algorithm_sites.programmers.kit202212;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Programmers_Graph_01 {

    public int solution(int n, int[][] edge) {
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            nodes.add(new Node(i));
        }

        for (int i = 0; i < edge.length; ++i) {
            int start = edge[i][0];
            int end = edge[i][1];

            nodes.get(start-1).adjacent.add(nodes.get(end-1));
            nodes.get(end-1).adjacent.add(nodes.get(start-1));
        }

        for (Node node : nodes) {
            System.out.println(node.number + "," + node.adjacent);
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(nodes.get(0));
        nodes.get(0).visited = true;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (Node node1 : node.adjacent) {
                if (!node1.visited) {
                    node1.visited = true;
                    node1.depth = node.depth + 1;
                    queue.add(node1);
                }
            }
        }

        int maxDepth = nodes.stream()
            .mapToInt(value -> value.depth)
            .max().getAsInt();

        return (int) nodes.stream()
            .filter(value -> value.depth == maxDepth)
            .count();
    }

    private static class Node {
        private int number;
        private int depth = 1;
        private boolean visited = false;
        private Set<Node> adjacent = new HashSet<>();

        public Node(int number) {
            this.number = number;
        }
    }

}
