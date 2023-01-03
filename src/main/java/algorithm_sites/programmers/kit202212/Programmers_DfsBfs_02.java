package algorithm_sites.programmers.kit202212;

import java.util.LinkedList;
import java.util.Queue;

public class Programmers_DfsBfs_02 {

    private int[] xx = new int[] {0,0,1,-1};
    private int[] yy = new int[] {1,-1,0,0};

    public int solution(int[][] maps) {
        if (maps == null) {
            return -1;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0, 1));
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (int i = 0; i < 4; ++i) {
                int adjX = node.x + xx[i];
                int adjY = node.y + yy[i];

                if (adjX >= 0 && adjY >= 0 && adjX < maps.length && adjY < maps[0].length && maps[adjX][adjY] == 1) {
                    if (adjX == maps.length-1 && adjY == maps[0].length-1) {
                        return node.distance+1;
                    }
                    queue.add(new Node(adjX, adjY, node.distance + 1));
                    maps[adjX][adjY] = 0;
                }
            }
        }

        return -1;
    }

    private class Node {
        private int x;
        private int y;
        private int distance;

        public Node(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

}
