package algorithm_sites.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class GameMapMinimumDistance {

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static int solution_2(int[][] maps) {
        Queue<Coord> queue = new LinkedList<>();
        queue.add(new Coord(0, 0, 1));

        while (!queue.isEmpty()) {
            Coord coord = queue.poll();
            int x = coord.x;
            int y = coord.y;

            if (maps[x][y] != 1) {
                continue;
            }

            maps[x][y] = 0;

            for (int i = 0; i < 4; ++i) {
                // 다음 위치
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length && maps[nx][ny] != 0) {
                    if (nx == maps.length-1 && ny == maps[0].length-1) {
                        return coord.depth+1;
                    }

                    queue.offer(new Coord(nx, ny, coord.depth+1));
                }
            }
        }

        return -1;
    }

    public static int solution_1(int[][] maps) {
        Queue<Coord> queue = new LinkedList<>();
        queue.add(new Coord(0, 0, 1));

        while (!queue.isEmpty()) {
            Coord coord = queue.poll();
            int x = coord.x;
            int y = coord.y;

            maps[x][y] = 0;

            for (int i = 0; i < 4; ++i) {
                // 다음 위치
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length && maps[nx][ny] != 0) {
                    if (nx == maps.length-1 && ny == maps[0].length-1) {
                        return coord.depth+1;
                    }

                    queue.offer(new Coord(nx, ny, coord.depth+1));
                }
            }
        }

        return -1;
    }

    static class Coord {
        int x;
        int y;
        int depth;
        public Coord(int x, int y, int depth) {
            this.x = x;
            this.y = y;
            this.depth = depth;
        }
    }

    public static void main(String args[]) {
        int result = solution_1(new int[][]{
//        int result = solution_2(new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}});

        System.out.print("Result: ");
        System.out.println(result);
    }

}
