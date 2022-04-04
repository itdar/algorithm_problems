package algorithm_sites.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class DfsBfs_02_Network {

    private int count = 0;

    public int solution(int computerCount, int[][] computers) {
        boolean[] visited = new boolean[computerCount];

        for (int i = 0; i < computerCount; ++i) {
            if (!visited[i]) {
                ++count;
                bfs(i, computers, visited);
            }
        }

        return count;
    }

    private void bfs(int index, int[][] computers, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(index);
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            visited[poll] = true;

            for (int i = 0; i < computers[poll].length; ++i) {
                if (!visited[i] && computers[poll][i] == 1) {
                    queue.add(i);
                }
            }
        }
    }

}
