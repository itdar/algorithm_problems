package algo_lib;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void bfs(int current) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(current);

        visited[current] = true;

        while(!queue.isEmpty()) {
            int x = queue.poll();

            System.out.println(current + " ");

            for (int i = 0; i < graph.get(current).size(); ++i) {
                int y = graph.get(current).get(i);
                if (!visited[y]) {
                    queue.add(y);
                    visited[y] = true;
                }
            }
        }

    }

    public static void main(String args[]) {

    }
}
