package algo_lib.dfs_bfs;

import java.util.Stack;

public class DfsGrid {

    private int[] dx = new int[] {-1, 1, 0, 0};
    private int[] dy = new int[] {0, 0, 1, -1};

    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public int dfs(int[][] grid, int _startX, int _startY) {
        if (grid == null) return -1;
        if (grid.length == 0 || grid[0].length == 0) return -1;
        if (_startX < 0 || _startX >= grid.length || _startY < 0 || _startY >= grid[0].length) return -1;

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        this.startX = _startX;
        this.startY = _startY;
        endX = grid.length-1;
        endY = grid[0].length-1;

        Stack<Node> stack = new Stack<>();
        stack.push(Node.of(startX, startY, 0));
        visited[startX][startY] = true;

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            int x = node.x;
            int y = node.y;
            int depth = node.depth;

            for (int i = 0; i < 4; ++i) {
                int dx = x + this.dx[i];
                int dy = y + this.dy[i];

                if (isInValidGrid(grid, dx, dy)) {
                    if (!isVisited(visited, dx, dy) && isMovable(grid[dx][dy])) {

                        if (endX == dx && endY == dy) {
                            return ++depth;
                        }

                        stack.push(Node.of(dx, dy, depth+1));
                        visited[dx][dy] = true;
                    }
                }
            }
        }

        return -1;
    }

    private boolean isVisited(boolean[][] visited, int dx, int dy) {
        return visited[dx][dy];
    }

    private boolean isMovable(int something) {
        return something == 0;
    }

    private boolean isInValidGrid(int[][] grid, int dx, int dy) {
        return dx >= 0 && dx < grid.length && dy >= 0 && dy < grid[0].length;
    }

    private static class Node {
        int x;
        int y;
        int depth;

        static Node of(int x, int y, int depth) {
            return new Node(x, y, depth);
        }

        private Node(int x, int y, int depth) {
            this.x = x;
            this.y = y;
            this.depth = depth;
        }
    }
}
