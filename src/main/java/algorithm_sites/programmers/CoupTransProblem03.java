package algorithm_sites.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class CoupTransProblem03 {
    public static boolean[][] visited;
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
    public static int[][] result;

    /**
     * 이게 정답은 맞는데
     * 퍼포먼스가 안나옴
     * 
     * 다이나믹으로 하려고 했는데 실패함
     */
    public static int[][] fitSolution(int[][] city) {
        result = new int[city.length][city[0].length];

        for (int i = 0; i < city.length; ++i) {
            for (int j = 0; j < city[i].length; ++j) {
                if (city[i][j] == 1) {
                    visited = new boolean[city.length][city[i].length];
                    result[i][j] = bfs(city, i, j);
                }
            }
        }

        return result;
    }

    private static int bfs(int[][] city, int x, int y) {
        if (city[x][y] == 0) return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x, y, 1));

        while(!queue.isEmpty()) {
            Node node = queue.poll();
            int inX = node.x;
            int inY = node.y;
            int depth = node.depth;

            for (int i = 0; i < 4; i++) {
                int nx = inX + dx[i];
                int ny = inY + dy[i];

                if (nx < 0 || nx >= city.length || ny < 0 || ny >= city[0].length || visited[nx][ny])
                    continue;

                visited[nx][ny] = true;

                if (city[nx][ny] == 1) {
                    queue.add(new Node(nx, ny, depth + 1));
                } else {
                    return depth;
                }

            }

        }

        return 0;
    }

    static class Node {

        private int x;
        private int y;
        private int depth;
        public Node(int x, int y, int depth) {
            this.x = x;
            this.y = y;
            this.depth = depth;
        }
    }

    public static void main(String args[]) {
        int[][] result1 = fitSolution(new int[][]{{0, 0, 1}, {1, 1, 1}, {0, 1, 1}});
        for (int[] ints : result1) {
            for (int anInt : ints) {
                System.out.print(anInt + " " );
            } System.out.println("");
        } System.out.println("----------------");

        int[][] result2 = fitSolution(new int[][]{{1,0,0}, {0,1,1}, {1,1,1}});
        for (int[] ints : result2) {
            for (int anInt : ints) {
                System.out.print(anInt + " " );
            } System.out.println("");
        } System.out.println("----------------");

        int[][] result3 = fitSolution(new int[][]{{1,0,0,0,0},
                                                {0,1,0,0,0},
                                                {0,0,1,0,0},
                                                {0,0,0,1,0},
                                                {0,0,0,0,1}});
        for (int[] ints : result3) {
            for (int anInt : ints) {
                System.out.print(anInt + " " );
            } System.out.println("");
        } System.out.println("----------------");

        int[][] result4 = fitSolution(new int[][]{
                {0,1,1,1,1},
                {1,0,1,1,1},
                {1,1,0,1,1},
                {1,1,1,0,1},
                {1,1,1,1,0}});
        for (int[] ints : result4) {
            for (int anInt : ints) {
                System.out.print(anInt + " " );
            } System.out.println("");
        } System.out.println("----------------");

        int[][] result5 = fitSolution(new int[][]{
                {0,1,1,1,0},
                {1,0,1,1,1},
                {1,1,0,1,1},
                {1,1,1,0,1},
                {0,1,1,1,0}});
        for (int[] ints : result5) {
            for (int anInt : ints) {
                System.out.print(anInt + " " );
            } System.out.println("");
        } System.out.println("----------------");

        int[][] result6 = fitSolution(new int[][]{
                {0,1,1,1,1},
                {1,1,1,1,1},
                {1,1,0,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1}});
        for (int[] ints : result6) {
            for (int anInt : ints) {
                System.out.print(anInt + " " );
            } System.out.println("");
        } System.out.println("----------------");

        int[][] result7 = fitSolution(new int[][]{
                {1,1,1,1,1},
                {1,0,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1}});
        for (int[] ints : result7) {
            for (int anInt : ints) {
                System.out.print(anInt + " " );
            } System.out.println("");
        } System.out.println("----------------");
    }

}
